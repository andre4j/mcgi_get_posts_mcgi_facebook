package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.GetPagesDTO;

@FeignClient(name = "GetPagesFeign", url = "https://graph.facebook.com/v23.0")
public interface GetPagesFeign {

    @GetMapping(path = "me/accounts")
    public GetPagesDTO getAllPages(
            @RequestParam("access_token") String accessToken);
}