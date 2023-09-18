package Duck;

public class Duck {
    FlyBehaviours flying_mode;
    Quack quck_mode;

    public Duck() {

    }

    public Duck(FlyBehaviours f, Quack q) {
        this.flying_mode = f;
        this.quck_mode = q;
    }

    public void fly() {
        flying_mode.fly();
    }

    public void quack() {
        quck_mode.sound();
    }
}