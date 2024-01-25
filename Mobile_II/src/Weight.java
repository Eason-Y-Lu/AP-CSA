public class Weight implements Structure {

    private final int weight;

    public Weight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isBalanced() {
        return true;
    }
}
