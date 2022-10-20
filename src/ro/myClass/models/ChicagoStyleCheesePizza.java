package ro.myClass.models;

public class ChicagoStyleCheesePizza extends  Pizza{
    public  ChicagoStyleCheesePizza(){
        super.setName("Chicago Style Deep Dish Cheese Pizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");
        this.toppings.add("Shredded Mozzarella Cheese");
    }
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
