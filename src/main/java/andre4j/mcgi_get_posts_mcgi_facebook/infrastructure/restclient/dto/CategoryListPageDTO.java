package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CategoryListPageDTO(
        @JsonProperty("id") String id,
        @JsonProperty("name") String name) {
}