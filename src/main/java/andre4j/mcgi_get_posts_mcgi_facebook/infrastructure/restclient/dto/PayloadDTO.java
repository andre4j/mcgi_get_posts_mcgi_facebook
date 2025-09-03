package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

import java.util.List;

public record PayloadDTO(
        String access_token,
        String category,
        String name,
        String id,
        List<String> tasks) {
}