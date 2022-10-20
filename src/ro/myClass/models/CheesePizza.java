package ro.myClass.models;

public class CheesePizza extends Pizza {

    public CheesePizza(){
     super.setName("Cheese Pizza");
     super.setDough("Regular Crust");
     super.setSauce("Marinara Pizza Sauce");
     super.toppings.add("Fresh Mozarella");
     super.toppings.add("Parmesan");
    }


}
