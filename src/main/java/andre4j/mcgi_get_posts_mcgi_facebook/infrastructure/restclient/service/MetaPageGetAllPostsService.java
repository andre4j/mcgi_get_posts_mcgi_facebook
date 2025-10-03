package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.service;

import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.MetaArrayPostsDTO;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetAllPostsMetaFeign;

@Service
public class MetaPageGetAllPostsService {
    private final GetAllPostsMetaFeign getAllPostsMetaFeign;

    public MetaPageGetAllPostsService(GetAllPostsMetaFeign getAllPostsMetaFeign) {
        this.getAllPostsMetaFeign = getAllPostsMetaFeign;
    }

    public MetaArrayPostsDTO getPageID(String pageId, String access_token) {
        return getAllPostsMetaFeign.getAllPosts(pageId, access_token);
    }
}
