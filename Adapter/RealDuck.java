package Adapter;

public class RealDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack Quack Ducker");
    }

    @Override
    public void fly() {
        System.out.println("Fly~~ - Tobey Maguire, Spider-Man");
    }

}
