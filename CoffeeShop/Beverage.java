package CoffeeShop;

public abstract class Beverage {
    String description = "Empty Cup";

    public String getdescription() {
        return description;
    }

    public abstract double cost();
}