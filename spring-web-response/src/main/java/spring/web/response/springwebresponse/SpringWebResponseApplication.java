package spring.web.response.springwebresponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringWebResponseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebResponseApplication.class, args);
    }
}
