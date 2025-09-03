package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.service;

import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.MetaArrayPostsDTO;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetAllPostsMetaFeign;

@Service
public class MetaPageGetAllPostsService {
    private final GetAllPostsMetaFeign getAllPostsMetaFeign;
    private final String access_token;

    public MetaPageGetAllPostsService(GetAllPostsMetaFeign getAllPostsMetaFeign,
            String access_token) {
        this.getAllPostsMetaFeign = getAllPostsMetaFeign;
        this.access_token = access_token;
    }

    public MetaArrayPostsDTO getPageID() {
        return getAllPostsMetaFeign.getAllPosts(access_token);
    }
}
