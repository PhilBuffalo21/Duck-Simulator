package Tree;

public interface Tree<E extends Number> {
    public void add(Tree<E> a);

    public void increment();

    public String treeOut();
}
