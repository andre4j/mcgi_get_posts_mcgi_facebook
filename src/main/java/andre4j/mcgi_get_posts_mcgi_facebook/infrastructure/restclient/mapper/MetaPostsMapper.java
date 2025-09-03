package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import andre4j.mcgi_get_posts_mcgi_facebook.domain.model.PostModel;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.MetaPostsDTO;

@Mapper(componentModel = "spring")
public interface MetaPostsMapper {
    PostModel toModel(MetaPostsDTO metaPostsDTO);

    MetaPostsDTO toDTO(PostModel postModel);

    List<PostModel> toListModel(List<MetaPostsDTO> metaPostsListDTO);

    List<MetaPostsDTO> toListDTO(List<PostModel> postListModel);
}
