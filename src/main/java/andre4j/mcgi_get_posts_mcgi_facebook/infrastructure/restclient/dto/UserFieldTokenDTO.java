package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserFieldTokenDTO(
                @JsonProperty("access_token") String accessToken,
                @JsonProperty("token_type") String tokenType) {
}
