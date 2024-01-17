public class Cow implements Comparable<Cow> {
    private final int itWeight;
    private final String itName;

    public Cow(int weight, String name) {
        itWeight = weight;
        itName = name;
    }

    public Cow() {
        itName = "Anonymous Cow";
        itWeight = 1800;
    }

    public String getName() {
        return itName;
    }

    public int getWeight() {
        return itWeight;
    }

    @Override
    public int compareTo(Cow o) {
        return Integer.compare(itWeight, o.itWeight);
    }
}
