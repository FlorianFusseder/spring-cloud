package spring.web.request.springwebrequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledRequest {

    @Value("${web.response.url}")
    private String url;

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledRequest.class);
    private RestTemplate restTemplate = new RestTemplate();

    @Scheduled(fixedRate = 3000)
    private void makeRequest() {
        LOGGER.info("Trying to make request with {}!", url);
        try {
            String forObject = restTemplate.getForObject(url, String.class);
            LOGGER.info("Response = " + forObject);
        } catch (Error e) {
            LOGGER.error("Could not get Response", e.getMessage());
        }
    }

}
