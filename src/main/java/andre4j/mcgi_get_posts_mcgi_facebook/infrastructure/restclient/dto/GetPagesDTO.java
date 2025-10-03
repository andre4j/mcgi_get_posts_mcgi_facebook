package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GetPagesDTO(
                @JsonProperty("data") List<DataGetPagesDTO> data,
                @JsonProperty("paging") Paging paging) {
}

@JsonIgnoreProperties(ignoreUnknown = true)
record Paging(
                @JsonProperty("cursors") Cursors cursors) {
}

@JsonIgnoreProperties(ignoreUnknown = true)
record Cursors(
                @JsonProperty("before") String before,
                @JsonProperty("after") String after) {
}