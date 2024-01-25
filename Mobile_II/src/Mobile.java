public class Mobile implements Structure {

    private final Branch left;
    private final Branch right;

    public Mobile(Branch left, Branch right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int getWeight() {
        return left.getStruct().getWeight() +
                right.getStruct().getWeight();
    }

    @Override
    public boolean isBalanced() {
        return ((left.getStruct().isBalanced() && right.getStruct().isBalanced()) && (left.torque() == right.torque()));
    }
}
