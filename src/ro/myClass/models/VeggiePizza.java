package ro.myClass.models;

public class VeggiePizza extends Pizza{
    public VeggiePizza(){
        super.setName("Veggie pizza");
        super.setDough("Crust");
        super.setSauce("Marinara sauce");
        super.toppings.add("Shredded mozzarella");
        super.toppings.add("Grated parmesan");
        super.toppings.add("Diced onion");
        super.toppings.add("Sliced mushrooms");
        super.toppings.add("Sliced red pepper");
        super.toppings.add("Sliced black olives");
    }
}
