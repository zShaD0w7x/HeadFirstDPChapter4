package ro.myClass.models;

public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza(){
        this.setName("Chicago Style Pepperoni Pizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");
        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Black Olives");
        this.toppings.add("Spinach");
        this.toppings.add("Eggplant");
        this.toppings.add("Sliced Pepperoni");
    }
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
