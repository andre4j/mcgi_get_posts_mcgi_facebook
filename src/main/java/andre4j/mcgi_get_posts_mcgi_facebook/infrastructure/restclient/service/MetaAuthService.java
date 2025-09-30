package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.UserFieldTokenDTO;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetUserTokenLongDurationFeign;

@Service
public class MetaAuthService {
    private final GetUserTokenLongDurationFeign getAllAccessTokenLongDurationFeign;

    @Value("${meta.grant-type}")
    private String grant_type;

    @Value("${meta.app-id}")
    private String app_id;

    @Value("${meta.app-secret}")
    private String app_secret;

    @Value("${meta.fb-exchange-token}")
    private String fb_exchange_token;

    public MetaAuthService(
            GetUserTokenLongDurationFeign getAllAccessTokenLongDurationFeign) {
        this.getAllAccessTokenLongDurationFeign = getAllAccessTokenLongDurationFeign;
    }

    public UserFieldTokenDTO getLongDurationAccessToken() {
        return getAllAccessTokenLongDurationFeign.getAllAccessTokenLongDuration(
                grant_type,
                app_id,
                app_secret,
                fb_exchange_token);
    }
}
