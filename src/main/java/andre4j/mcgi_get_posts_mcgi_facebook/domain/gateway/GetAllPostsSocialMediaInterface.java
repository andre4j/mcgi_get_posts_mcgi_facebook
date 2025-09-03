package andre4j.mcgi_get_posts_mcgi_facebook.domain.gateway;

import java.util.List;

import andre4j.mcgi_get_posts_mcgi_facebook.domain.model.PostModel;

public interface GetAllPostsSocialMediaInterface {
    List<PostModel> getAllPosts();
}