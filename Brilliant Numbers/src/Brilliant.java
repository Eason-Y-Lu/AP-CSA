import java.util.ArrayList;
import java.util.Comparator;

public class Brilliant {
    ArrayList<Integer> brilliant = new ArrayList<>();

    public Brilliant() {
        //single digit 4
        //double digit 16
        Primes bPrimes = new Primes(20);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                brilliant.add(bPrimes.getPrimesReversed().get(i) * bPrimes.getPrimesReversed().get(j));
            }
        }
        for (int i = 4; i < 15; i++) {
            for (int j = 4; j <= i; j++) {
                brilliant.add(bPrimes.getPrimesReversed().get(i) * bPrimes.getPrimesReversed().get(j));
            }
        }
        brilliant.sort(Comparator.naturalOrder());
    }

    public ArrayList<Integer> getBrilliant() {

        return brilliant;
    }
}
