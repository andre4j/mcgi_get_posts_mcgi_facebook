package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.UserFieldTokenDTO;

@FeignClient(name = "GetUserTokenLongDurationFeign", url = "https://graph.facebook.com/v23.0")
public interface GetUserTokenLongDurationFeign {

    @GetMapping(path = "/oauth/access_token")
    public UserFieldTokenDTO getAllAccessTokenLongDuration(
            @RequestParam("grant_type") String grantType,
            @RequestParam("client_id") String clientId,
            @RequestParam("client_secret") String clientSecret,
            @RequestParam("fb_exchange_token") String fbExchangeToken);
}
