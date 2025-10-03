package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MetaPostsDTO(
        @JsonProperty("created_time") String createdData,
        @JsonProperty("message") String text,
        @JsonProperty("id") String idPost) {
}
