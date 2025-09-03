package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.MetaArrayPostsDTO;

@FeignClient(name = "GetAllPostsMetaFeign", url = "https://graph.facebook.com/v23.0")
public interface GetAllPostsMetaFeign {

    @GetMapping(path = "${META_PAGE_ID}/posts")
    public MetaArrayPostsDTO getAllPosts(
            @RequestParam("access_token") String access_token);
}