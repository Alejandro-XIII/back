package co.udea.ssmu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication

public class SsmuApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SsmuApiApplication.class, args);
    }

}
