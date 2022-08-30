package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.VacinaController;

@SpringBootApplication
@ComponentScan(basePackageClasses = VacinaController.class)
public class PrincipalSpring {

	public static void main(String[] args) {
		SpringApplication.run(PrincipalSpring.class, args);
		
	}

}
