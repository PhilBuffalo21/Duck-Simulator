package Tree;

import java.util.ArrayList;

public class Branch<E extends Number> implements Tree<E> {
    ArrayList<Tree<E>> stuff;

    public Branch() {
        stuff = new ArrayList<>();
    }

    @Override
    public void add(Tree<E> a) {
        stuff.add(a);
    }

    @Override
    public void increment() {
        for (Tree<E> t : stuff) {
            t.increment();
        }
    }

    @Override
    public String treeOut() {
        String string = "*";
        for (Tree<E> t : stuff) {
            string += " " + t.treeOut();
        }
        return string;
    }

}
