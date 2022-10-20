package ro.myClass.models;

public class NYPizzaStore extends PizzaStore{
    public NYPizzaStore(){
        super();
    }
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else {
            return item.equals("pepperoni") ? new NYStylePepperoniPizza() : null;
        }
    }
    }

