import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cow[] cows = {new Cow(2000, "Hulk"), new Cow(), new Cow(1600, "Bessie"), new Cow(1700, "Moohead"), new Cow(), new Cow(1900, "Big Time Jones")};

        printArray(cows);
        Arrays.sort(cows);
        printArray(cows);
    }

    public static void printArray(Cow[] cows) {
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < cows.length; i++) {
            System.out.println(cows[i].getName() + ", ");
        }
        System.out.println("\n");
    }
}
