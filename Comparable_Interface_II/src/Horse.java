public class Horse extends Animal {
    public Horse() {
        setName("Anonymous Horse");
        setWeight(1800);
    }

    public Horse(int itsWeight, String itsName) {
        super(itsWeight, itsName);
    }
}
