package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

import org.springframework.stereotype.Component;

public record UserFieldTokenDTO(
        String access_token,
        String token_type,
        Number expires_in) {
}
