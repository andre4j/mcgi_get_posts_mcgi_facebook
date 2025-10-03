package andre4j.mcgi_get_posts_mcgi_facebook.domain.gateway;

import java.util.List;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.MetaPostsDTO;

public interface GetAllPostsSocialMediaInterface {
    List<MetaPostsDTO> getAllPosts();
}