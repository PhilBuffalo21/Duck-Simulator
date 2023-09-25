package CoffeeShop;

public class WhippedCream extends Toppings {
    Beverage currentDrink;

    public WhippedCream(Beverage b) {
        this.currentDrink = b;
    }

    @Override
    public String getDescription() {
        return currentDrink.getdescription() + " Whipped Cream";
    }

    @Override
    public double cost() {
        return currentDrink.cost() + 0.10;
    }

}
