package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.domain.gateway.GetAllPostsSocialMediaInterface;
import andre4j.mcgi_get_posts_mcgi_facebook.domain.model.PostModel;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetUserTokenLongDurationFeign;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetAllPostsMetaFeign;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.mapper.MetaPostsMapper;

@Service
public class MetaPostGatewayImpl implements GetAllPostsSocialMediaInterface {
    private final GetAllPostsMetaFeign getAllPostsMetaFeign;
    private final GetUserTokenLongDurationFeign getAllAccessTokenLongDurationFeign;
    private final MetaPostsMapper metaPostsMapper;

    public MetaPostGatewayImpl(GetAllPostsMetaFeign getAllPostsMetaFeign,
            GetUserTokenLongDurationFeign getAllAccessTokenLongDurationFeign,
            MetaPostsMapper metaPostsMapper) {
        this.getAllPostsMetaFeign = getAllPostsMetaFeign;
        this.getAllAccessTokenLongDurationFeign = getAllAccessTokenLongDurationFeign;
        this.metaPostsMapper = metaPostsMapper;
    }

    @Override
    public List<PostModel> getAllPosts() {
        var authService = new MetaAuthService(
                getAllAccessTokenLongDurationFeign);
        var postService = new MetaPageGetAllPostsService(getAllPostsMetaFeign,
                authService.getLongDurationAccessToken().access_token());

        return metaPostsMapper.toListModel(postService.getPageID().data());
    }
}
