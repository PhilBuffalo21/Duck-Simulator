package Adapter;

public class Client {
    public static void main(String[] args) {
        Duck d = new RealDuck();
        Turkey t = new Turkey();
        System.out.print("Turkey: ");
        t.fly();
        t.gobble();
        System.out.println("\n");
        System.out.print("Duck: ");
        d.fly();
        System.out.print("AD: ");
        Duck ad = new AdapterToDuck(t);
        ad.fly();
        ad.quack();
        /*
         * this may not be the best example.
         * To clarify, `ad` can now be treated as if it were
         * a `Duck`. This `Turkey` has Adapter applied to it.
         * So, now it understands you when you command it to
         * "quack". Also, all the tools/toys made for a `Duck` work
         * on a `Turkey` too.
         * 
         */
    }
}
