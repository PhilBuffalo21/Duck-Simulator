package Adapter;

public class AdapterToDuck implements Duck {
    Turkey turkey;

    public AdapterToDuck(Turkey t) {
        this.turkey = t;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
