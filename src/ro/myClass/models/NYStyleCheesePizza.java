package ro.myClass.models;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        super.setName("NY Style Sauce and Cheese Pizza");
        super.setDough("Thin Crust Dough");
        super.setSauce("Marinara Sauce");
        super.toppings.add("Grated Reggiano cheese");
    }
}
