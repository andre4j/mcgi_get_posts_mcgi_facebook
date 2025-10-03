package andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.service;

import org.springframework.stereotype.Service;

import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.dto.GetPagesDTO;
import andre4j.mcgi_get_posts_mcgi_facebook.infrastructure.restclient.feign.GetPagesFeign;

@Service
public class MetaGetIDPageService {
    private final GetPagesFeign getPagesFeign;

    public MetaGetIDPageService(GetPagesFeign getPagesFeign) {
        this.getPagesFeign = getPagesFeign;
    }

    public GetPagesDTO GetPayloadMidiPage(String accessToken) {
        return getPagesFeign.getAllPages(accessToken);
    }
}
