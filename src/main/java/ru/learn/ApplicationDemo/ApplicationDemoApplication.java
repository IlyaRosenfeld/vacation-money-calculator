package ru.learn.ApplicationDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApplicationDemoApplication {

	public static void main(String[] args) {


		SpringApplication.run(ApplicationDemoApplication.class, args);
	}

	@GetMapping("/calculate")
	public float Calculate(@RequestParam(value = "avgSalary") float avgSalary,
						   @RequestParam(value = "vacationDays") int vacationDays) {

		return avgSalary /29.3f * vacationDays;
	}

}
