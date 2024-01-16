public class Main {
    public static void main(String[] args) {
        System.out.println(isBrilliant(33));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBrilliant(int number) {
        Primes lprimes = new Primes((int) Math.sqrt(number));
        for (int i = 0; i < lprimes.getPrimes().size(); i++) {
            if (number % lprimes.getPrimes().get(i) == 0) {
                if (Main.isPrime(number / lprimes.getPrimes().get(i))) {
                    return lengthOf2NumberSameLength(lprimes.getPrimes().get(i), number / lprimes.getPrimes().get(i));
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean lengthOf2NumberSameLength(int number1, int number2) {
        return (String.valueOf(number1).length() == String.valueOf(number2).length());
    }
}

