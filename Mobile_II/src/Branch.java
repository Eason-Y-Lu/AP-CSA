public class Branch implements Structure {

    private final int length;
    private final Structure struct;

    public Branch(int length, Structure struct) {
        this.length = length;
        this.struct = struct;
    }

    public int getLength() {
        return length;
    }

    public Structure getStruct() {
        return struct;
    }

    public int torque() {
        return (length * struct.getWeight());
    }

    @Override
    public int getWeight() {
        return struct.getWeight();
    }

    @Override
    public boolean isBalanced() {
        return true;
    }
}
