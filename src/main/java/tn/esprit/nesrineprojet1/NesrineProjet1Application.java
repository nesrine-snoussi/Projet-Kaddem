package tn.esprit.nesrineprojet1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;


@EnableScheduling
@SpringBootApplication

public class NesrineProjet1Application {

    public static void main(String[] args) {
        SpringApplication.run(NesrineProjet1Application.class, args);
    }

}
