public class Animal implements Comparable<Animal> {
    private static int itsWeight;
    private static String itsName;

    public Animal() {
        //Default Constructor to be overwritten
    }

    public Animal(int weight, String name) {
        itsWeight = weight;
        itsName = name;
    }

    public static int getWeight() {
        return itsWeight;
    }

    public static void setWeight(int weight) {
        itsWeight = weight;
    }

    public static String getName() {
        return itsName;
    }

    public static void setName(String name) {
        itsName = name;
    }

    public static void eat(int amtEaten) {
        itsWeight = +amtEaten;
    }

    @Override
    public int compareTo(Animal o) {
        if (itsWeight > getWeight()) {
            return 1;
        } else if (itsWeight == getWeight()) {
            return 0;
        } else {
            return -1;
        }
    }
}
