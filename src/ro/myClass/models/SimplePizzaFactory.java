package ro.myClass.models;

public class SimplePizzaFactory{

    public SimplePizzaFactory(){}


    Pizza createPizza(String type) {
      Pizza pizza = null;
      if(type.equals("cheese")){
          pizza = new CheesePizza();
      }else if(type.equals("pepperoni")){
          pizza = new PeperoniPizza();
      }else if(type.equals("veggie")){
          pizza = new VeggiePizza();
      }
      return (Pizza) pizza;
    }
}
