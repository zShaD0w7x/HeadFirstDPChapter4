package ro.myClass.models;

public class PeperoniPizza extends Pizza {

    public PeperoniPizza(){
        super.setName("Peperoni Pizza");
        super.setDough("Crust");
        super.setSauce("Marinara sauce");
        super.toppings.add("Sliced Peperoni");
        super.toppings.add("Sliced Onion");
        this.toppings.add("Grated parmesan cheese");
    }
}
