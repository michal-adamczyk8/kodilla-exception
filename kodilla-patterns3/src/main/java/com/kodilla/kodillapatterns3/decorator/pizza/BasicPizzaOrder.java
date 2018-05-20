package com.kodilla.kodillapatterns3.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getPrice(){
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza with tomato sauce and cheese";
    }
}
