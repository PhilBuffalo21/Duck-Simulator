package Duck;

public class CannotFly implements FlyBehaviours {

    @Override
    public void fly() {
        System.out.println("NO FLY");
    }

}
