package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="repository")
@EntityScan("model")
@SpringBootApplication
public class AxiumOrderingPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(AxiumOrderingPlatformApplication.class, args);
	}
}
