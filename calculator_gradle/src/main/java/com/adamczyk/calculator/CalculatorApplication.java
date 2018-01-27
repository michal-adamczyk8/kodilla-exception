package com.adamczyk.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		Calculator calculator = new Calculator(5,1);
		int result = calculator.addAtoB();
		System.out.println(result);
	}
}
