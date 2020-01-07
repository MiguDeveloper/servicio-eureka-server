package pe.tuna.servicioeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// Habilitamos el Eureka server
@EnableEurekaServer
@SpringBootApplication
public class ServicioEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioEurekaServerApplication.class, args);
    }

}
