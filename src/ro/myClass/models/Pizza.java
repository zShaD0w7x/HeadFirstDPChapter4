package ro.myClass.models;

import java.util.ArrayList;

public abstract  class Pizza {
    private String name;
    private String dough;
    private String sauce;
    ArrayList<String> toppings = new ArrayList<String>();
    public void prepare(){
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce....");
        System.out.println("Adding toppings: ");
        for(String topping :toppings){
            System.out.println(" " + topping);
        }
    }
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices ");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString(){
        String text = "";
        text += "Pizza " + this.name + "\n";
        text += "\nDough: " + dough;
        text += "\nSauce: " + sauce;
        text += "\nToppings:\n";
        for (int i = 0 ; i <this.toppings.size();i++){
            text += "\n" + toppings;
        }
        return text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }
}
