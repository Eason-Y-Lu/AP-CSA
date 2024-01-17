import java.util.ArrayList;
import java.util.Comparator;

public class Primes {
    private final ArrayList<Integer> PRIMES = new ArrayList<>();

    public Primes(int numOfPrimes) {
        int nPrimes = 2;
        while (numOfPrimes > 0) {
            if (Main.isPrime(nPrimes)) {
                PRIMES.add(nPrimes);
                numOfPrimes -= 1;
            }
            nPrimes += 1;
        }
        PRIMES.sort(Comparator.reverseOrder());
    }

    public ArrayList<Integer> getPrimes() {
        return PRIMES;
    }

    public ArrayList<Integer> getPrimesReversed() {
        PRIMES.sort(Comparator.naturalOrder());
        return PRIMES;
    }

    public boolean isPrime(int number) {
        if (number > PRIMES.get(0)) {
            int nPrimes = PRIMES.get(0) + 1;
            while (nPrimes <= number) {
                if (Main.isPrime(nPrimes)) {
                    PRIMES.add(nPrimes);
                }
                nPrimes += 1;
            }
        }
        return Main.isPrime(number);
    }
}
