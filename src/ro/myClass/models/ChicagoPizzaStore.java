package ro.myClass.models;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {
    }

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else {
            return item.equals("pepperoni") ? new ChicagoStylePepperoniPizza() : null;
        }
    }
}
