package org.example.demo;

import com.example.demo.FromSecond;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        FromSecond second = new FromSecond();
        SpringApplication.run(DemoApplication.class, args);
    }
}
