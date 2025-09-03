package andre4j.mcgi_get_posts_mcgi_facebook.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.domain.gateway.GetAllPostsSocialMediaInterface;
import andre4j.mcgi_get_posts_mcgi_facebook.domain.model.PostModel;

@Service
public class GetAllPostsSocialMedia {
    private GetAllPostsSocialMediaInterface getAllPostsSocialMediaInterface;

    public GetAllPostsSocialMedia(GetAllPostsSocialMediaInterface getAllPostsSocialMediaInterface) {
        this.getAllPostsSocialMediaInterface = getAllPostsSocialMediaInterface;
    }

    public List<PostModel> execute() {
        return getAllPostsSocialMediaInterface.getAllPosts();
    }
}
