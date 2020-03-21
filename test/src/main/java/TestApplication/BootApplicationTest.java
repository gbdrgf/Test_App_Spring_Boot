package TestApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplicationTest {
    public static void main(String[] args) {
        SpringApplication.run(BootApplicationTest.class);
        System.out.println("Hello World!");

    }
}
