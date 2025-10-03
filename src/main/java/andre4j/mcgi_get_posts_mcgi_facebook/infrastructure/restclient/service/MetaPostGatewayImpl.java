package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.domain.gateway.GetAllPostsSocialMediaInterface;
import andre4j.mcgi_get_posts_mcgi_facebook.domain.model.PostModel;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.GetPagesDTO;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.MetaPostsDTO;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetAllPostsMetaFeign;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetPageAccessTokenFeign;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.mapper.MetaPostsMapper;

@Service
public class MetaPostGatewayImpl implements GetAllPostsSocialMediaInterface {
    private final GetAllPostsMetaFeign getAllPostsMetaFeign;
    private final MetaGetIDPageService metaGetIDPageService;
    private final MetaPostsMapper metaPostsMapper;
    private final MetaAuthService authService;

    public MetaPostGatewayImpl(GetAllPostsMetaFeign getAllPostsMetaFeign,
            GetPageAccessTokenFeign getPageAccessTokenFeign, MetaGetIDPageService metaGetIDPageService,
            MetaPostsMapper metaPostsMapper, MetaAuthService authService) {
        this.getAllPostsMetaFeign = getAllPostsMetaFeign;
        this.metaGetIDPageService = metaGetIDPageService;
        this.metaPostsMapper = metaPostsMapper;
        this.authService = authService;
    }

    @Override
    public List<MetaPostsDTO> getAllPosts() {
        final String tokenLongDuration = authService.getLongDurationAccessToken().accessToken();

        MetaPageGetAllPostsService postService = new MetaPageGetAllPostsService(getAllPostsMetaFeign);

        GetPagesDTO payloadMidiPage = metaGetIDPageService.GetPayloadMidiPage(tokenLongDuration);

        String idMidiPage = payloadMidiPage.data().get(0).id();

        String accessTokenMidiPage = payloadMidiPage.data().get(0).accessToken();

        return postService.getPageID(idMidiPage, accessTokenMidiPage).data();
    }
}
