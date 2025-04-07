package lt.vilniustech.mkavalenka.cloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigServerApplication {
	public static void main(String[] arguments) {
		SpringApplication.run(CloudConfigServerApplication.class, arguments);
	}
}
