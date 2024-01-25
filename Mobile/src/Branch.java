public class Branch extends Structure {
    private final double length;
    private final Structure struct;

    public Branch(double length, Structure struct) {
        this.length = length;
        this.struct = struct;
    }

    public double getLength() {
        return length;
    }

    public Structure getStructure() {
        return struct;
    }

    public double torque() {
        return (length * this.struct.getWeight());
    }

    @Override
    public double getWeight() {
        return struct.getWeight();
    }

    @Override
    public boolean isBalanced() {
        return false;
    }
}