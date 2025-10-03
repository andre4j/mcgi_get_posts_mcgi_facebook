package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataGetPagesDTO(
        @JsonProperty("access_token") String accessToken,
        @JsonProperty("category") String category,
        @JsonProperty("category_list") List<CategoryListPageDTO> categoryList,
        @JsonProperty("name") String name,
        @JsonProperty("id") String id,
        @JsonProperty("tasks") List<String> tasks) {
}
