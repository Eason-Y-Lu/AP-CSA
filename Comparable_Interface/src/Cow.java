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
        if (itWeight > o.itWeight) {
            return 1;
        } else if (itWeight == o.itWeight) {
            return 0;
        } else {
            return -1;
        }
    }
}
