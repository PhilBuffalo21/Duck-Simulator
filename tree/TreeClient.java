package Tree;

public class TreeClient {
    public static void main(String[] args) throws Exception {
        Tree<Integer> two = new Leaf<Integer>(2);
        Tree<Integer> four = new Leaf<Integer>(4);
        Tree<Integer> eight = new Leaf<Integer>(8);
        Tree<Integer> three = new Leaf<Integer>(3);
        Tree<Integer> six = new Leaf<Integer>(6);
        Tree<Integer> nine = new Leaf<Integer>(9);
        //
        Branch<Integer> evens = new Branch<Integer>();
        evens.add(two);
        evens.add(four);
        evens.add(eight);

        Branch<Integer> odds = new Branch<Integer>();
        odds.add(three);
        odds.add(six);
        odds.add(nine);

        Branch<Integer> allNums = new Branch<Integer>();
        allNums.add(evens);
        allNums.add(odds);

        // What's this?
        Tree<Integer> nums = allNums;
        System.out.println(nums.treeOut());

        // three.add(six);
    }
}
