package Duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flying_mode = new CannotFly();
        quck_mode = new ArtificalQuack();
    }
}
