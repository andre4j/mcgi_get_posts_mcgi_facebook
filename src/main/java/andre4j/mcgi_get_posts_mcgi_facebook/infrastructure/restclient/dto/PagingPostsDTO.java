package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

public record PagingPostsDTO(
                CursorsPostsDTO cursors,
                String next) {
}