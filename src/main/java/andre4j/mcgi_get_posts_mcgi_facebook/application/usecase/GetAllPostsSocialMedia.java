package andre4j.mcgi_get_posts_mcgi_facebook.application.usecase;

import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.domain.gateway.GetAllPostsSocialMediaInterface;
import jakarta.annotation.PostConstruct;

@Service
public class GetAllPostsSocialMedia {
    private GetAllPostsSocialMediaInterface getAllPostsSocialMediaInterface;

    public GetAllPostsSocialMedia(GetAllPostsSocialMediaInterface getAllPostsSocialMediaInterface) {
        this.getAllPostsSocialMediaInterface = getAllPostsSocialMediaInterface;
    }

    @PostConstruct
    public void execute() {
        System.out.println(getAllPostsSocialMediaInterface.getAllPosts());
    }
}
