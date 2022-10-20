package ro.myClass.models;



public abstract class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(){this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();

        return pizza;

    }

    abstract Pizza createPizza(String type);

    public SimplePizzaFactory getFactory() {
        return factory;
    }

    public void setFactory(SimplePizzaFactory factory) {
        this.factory = factory;
    }
}

