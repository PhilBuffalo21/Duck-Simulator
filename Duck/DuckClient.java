package Duck;

public class DuckClient {
    public static void main(String[] args) {
        Duck joeTheRubberDuck = new RubberDuck();
        joeTheRubberDuck.fly();
        joeTheRubberDuck.quack();
    }
}