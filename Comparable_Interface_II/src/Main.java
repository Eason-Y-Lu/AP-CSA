import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Horse(2000, "Hulk"), new Wombat(), new Wombat(1600, "Bessie"), new Cow(1700, "Moohead"), new Wombat(), new Wildebeest(1900, "Big Time Jones")};


        printArray(animals);
        for (Animal a : animals) {
            //noinspection AccessStaticViaInstance
            a.eat(200);
        }
        Arrays.sort(animals);
        printArray(animals);
    }

    public static void printArray(Animal[] animals) {
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < animals.length; i++) {
            //noinspection AccessStaticViaInstance
            System.out.println(animals[i].getName() + ", ");
        }
        System.out.println("\n");
    }
}
