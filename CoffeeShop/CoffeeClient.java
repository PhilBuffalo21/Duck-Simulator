package CoffeeShop;

public class CoffeeClient {
    public static void main(String[] args) {
        Beverage c = new BasicCoffee();
        System.out.println("Before");
        System.out.println(c.getdescription());
        System.out.println(c.cost());
        c = new WhippedCream(c);
        System.out.println("After");
        System.out.println(c.getdescription());
        System.out.println(c.cost());
    }
}
