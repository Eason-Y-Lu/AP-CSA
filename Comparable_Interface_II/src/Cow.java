public class Cow extends Animal {
    public Cow() {
        setName("Anonymous Cow");
        setWeight(1800);
    }

    public Cow(int itsWeight, String itsName) {
        super(itsWeight, itsName);
    }
}
