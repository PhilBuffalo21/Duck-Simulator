package Duck;

public class ArtificalQuack implements Quack {

    @Override
    public void sound() {
        System.out.println("*STATIC* Quack *STATIC*");
    }

}
