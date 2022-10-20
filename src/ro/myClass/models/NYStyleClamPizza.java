package ro.myClass.models;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(){
        this.setName("NY Style Clam Pizza");
        this.setDough("Thin Crust Dough");
        this.setSauce("Marinara Sauce");
        this.toppings.add("Grated Reggiano Cheese");
        this.toppings.add("Fresh Clams from Long Island Sound");
    }
}
