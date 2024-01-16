import java.util.ArrayList;
import java.util.Comparator;

public class Primes {
    private final ArrayList<Integer> primes = new ArrayList<Integer>();

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
        //head
        return Main.isPrime(number);
    }
}
