package ro.myClass.models;

public class ChicagoStyleClamPizza extends Pizza{
     public ChicagoStyleClamPizza(){
      this.setName("Chicago Style Clam Pizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");
        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Frozen Clams from Chesapeake Bay");
}

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

