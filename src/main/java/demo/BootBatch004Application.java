package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import demo.repositories.repo;

@SpringBootApplication
//@ComponentScan ({"demo.repositories","demo.entities"})
public class BootBatch004Application {
	
	public static void main(String[] args) {
		SpringApplication.run(BootBatch004Application.class, args);
	}
}
