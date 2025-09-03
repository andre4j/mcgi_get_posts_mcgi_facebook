package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto;

import java.util.List;

public record MetaArrayPostsDTO(
                List<MetaPostsDTO> data,
                PagingPostsDTO paging) {
}
