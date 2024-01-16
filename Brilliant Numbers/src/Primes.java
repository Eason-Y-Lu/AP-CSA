import java.util.ArrayList;
import java.util.Comparator;

public class Primes {
    private final ArrayList<Integer> primes = new ArrayList<>();

    public Primes(int numOfPrimes) {
        int nPrimes = 2;
        while (numOfPrimes > 0) {
            if (Main.isPrime(nPrimes)) {
                primes.add(nPrimes);
                numOfPrimes -= 1;
            }
            nPrimes += 1;
        }
        primes.sort(Comparator.reverseOrder());
    }

    public ArrayList<Integer> getPrimes() {
        return primes;
    }

    public boolean isPrime(int number) {
        if (number > primes.get(0)) {
            int nPrimes = primes.get(0) + 1;
            while (nPrimes <= number) {
                if (Main.isPrime(nPrimes)) {
                    primes.add(nPrimes);
                }
                nPrimes += 1;
            }
        }
        return Main.isPrime(number);
    }
}
