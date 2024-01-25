public class Weight extends Structure {
    public Weight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public boolean isBalanced() {
        return true;
    }
}
