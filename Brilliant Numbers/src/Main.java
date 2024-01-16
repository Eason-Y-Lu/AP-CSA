public class Main {
    public static void main(String[] args) {
        //System.out.println(isPrime(2));
        Primes primes = new Primes(50);
        System.out.println(primes.getPrimes());
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

