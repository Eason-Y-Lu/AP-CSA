public class Mobile extends Structure {
    private final Branch left;
    private final Branch right;

    public Mobile(Branch left, Branch right) {
        this.left = left;
        this.right = right;
    }

    public Branch getLeft() {
        return this.left;
    }

    public Branch getRight() {
        return this.right;
    }

    @Override
    public boolean isBalanced() {
        return left.torque() == right.torque();
    }

    @Override
    public double getWeight() {
        return (left.getWeight() + right.getWeight());
    }
}
