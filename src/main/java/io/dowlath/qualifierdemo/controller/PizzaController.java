package io.dowlath.qualifierdemo.controller;

import io.dowlath.qualifierdemo.service.Pizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    private Pizza pizza;

    /*
       Getting this error without qualifier annotation

    Parameter 0 of constructor in io.dowlath.qualifierdemo.controller.
    PizzaController required a single bean, but 2 were found:
	- nonVegPizza: defined in file [D:\qualifier-demo\qualifier-demo\target\classes\io\dowlath\qualifierdemo\service\NonVegPizza.class]
	- vegPizza: defined in file [D:\qualifier-demo\qualifier-demo\target\classes\io\dowlath\qualifierdemo\service\VegPizza.class]

This may be due to missing parameter name information

After updated @Qualifier , getting the below output.

        Veg Pizza...!

     */



    public PizzaController(@Qualifier("vegPizza") Pizza pizza){
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }
}
