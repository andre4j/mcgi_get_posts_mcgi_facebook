package andre4j.mcgi_get_posts_mcgi_facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class McgiGetPostsMcgiFacebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(McgiGetPostsMcgiFacebookApplication.class, args);
	}
}
