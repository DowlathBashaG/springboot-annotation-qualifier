package io.dowlath.qualifierdemo;

import io.dowlath.qualifierdemo.controller.PizzaController;
import io.dowlath.qualifierdemo.service.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QualifierDemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(QualifierDemoApplication.class, args);
		PizzaController pizzaController = (PizzaController)context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());


	}

}
