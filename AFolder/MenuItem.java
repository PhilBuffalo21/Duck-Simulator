package AFolder;

public class MenuItem implements MenuComponent {
    String name;
    Double price;

    public MenuItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(name + ", " + price);
    }

}
