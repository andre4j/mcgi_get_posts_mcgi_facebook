package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

public record MetaPostsDTO(
                String linkOfPost,
                String description,
                String story,
                String typeOfPost,
                String datePublish) {
}
