package Tree;

public class Leaf<E extends Number> implements Tree<E> {
    Integer val;

    public Leaf(Integer i) {
        this.val = i;
    }

    @Override
    public void add(Tree<E> a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void increment() {
        val++;
    }

    @Override
    public String treeOut() {
        return val.toString();
    }

}
