//code by Om
public class Main {
    public static void main(String[] args) {
        System.out.println(fastExpt(7, 10));
    }

    public static int fastExpt(int b, int n) {
        int i = n;
        int m = 1;
        while (i > 0) {
            if (i % 2 == 0) {
                b *= b;
                i /= 2;
            } else {
                m *= b;
                i -= 1;
            }
        }
        return m;
    }

}

