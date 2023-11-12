package co.udea.ssmu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@Configuration
public class SsmuApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SsmuApiApplication.class, args);
    }

}
