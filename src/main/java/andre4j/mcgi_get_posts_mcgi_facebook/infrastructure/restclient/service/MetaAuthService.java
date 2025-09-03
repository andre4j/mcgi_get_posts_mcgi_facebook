package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.UserFieldTokenDTO;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetUserTokenLongDurationFeign;

@Service
public class MetaAuthService {
    private final GetUserTokenLongDurationFeign getAllAccessTokenLongDurationFeign;

    @Value("${META_GRANT_TYPE}")
    private String grant_type;

    @Value("${META_APP_ID}")
    private String app_id;

    @Value("${META_APP_SECRET}")
    private String app_secret;

    @Value("${META_FB_EXCHANGE_TOKEN}")
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
