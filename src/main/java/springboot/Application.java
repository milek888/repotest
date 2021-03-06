package springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.logging.Logger;

@SpringBootApplication
@EnableWebMvc
public class Application implements ApplicationListener<ContextRefreshedEvent> {
//5555555555555555555555555
//666666666666666
//7777777777777777777777777
//888888888888888888888888888888
//999999999999999999

    private static final Logger LOG = Logger.getLogger("Application.class");

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        LOG.info("activeProfile: " + activeProfile);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
