package ro.myClass.models;

public class ClamPizza extends Pizza{

    public ClamPizza(){
        super.setName("Clam Pizza");
        super.setDough("Thin crust");
        super.setSauce("White garlic sauce");
        super.toppings.add("Clams");
        super.toppings.add("Grated parmesan cheese");
    }


}
