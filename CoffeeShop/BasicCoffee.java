package CoffeeShop;

public class BasicCoffee extends Beverage {

    public BasicCoffee() {
        description = "Basic Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
