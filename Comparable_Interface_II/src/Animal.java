public class Animal implements Comparable<Animal> {
    private int itsWeight;
    private String itsName;

    public Animal() {
        //Default Constructor to be overwritten
    }

    public Animal(int weight, String name) {
        itsWeight = weight;
        itsName = name;
    }

    public int getWeight() {
        return itsWeight;
    }

    public void setWeight(int weight) {
        itsWeight = weight;
    }

    public String getName() {
        return itsName;
    }

    public void setName(String name) {
        itsName = name;
    }

    public void eat(int amtEaten) {
        itsWeight = itsWeight + amtEaten;
    }

    @Override
    public int compareTo(Animal o) {
        if (itsWeight > o.getWeight()) {
            return 1;
        } else if (itsWeight == o.getWeight()) {
            return 0;
        } else {
            return -1;
        }
    }
}
