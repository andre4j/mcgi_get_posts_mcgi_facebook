package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.UserFieldTokenDTO;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetUserTokenLongDurationFeign;

@Service
public class MetaAuthService {
    private final GetUserTokenLongDurationFeign getAllAccessTokenLongDurationFeign;

    @Value("${meta.grant-type}")
    private String grantType;

    @Value("${meta.app-id}")
    private String clientId;

    @Value("${meta.app-secret}")
    private String appSecret;

    @Value("${meta.fb-exchange-token}")
    private String fbExchangeToken;

    public MetaAuthService(GetUserTokenLongDurationFeign getAllAccessTokenLongDurationFeign) {
        this.getAllAccessTokenLongDurationFeign = getAllAccessTokenLongDurationFeign;
    }

    public UserFieldTokenDTO getLongDurationAccessToken() {
        return getAllAccessTokenLongDurationFeign.getAllAccessTokenLongDuration(
                grantType,
                clientId,
                appSecret,
                fbExchangeToken);
    }
}
