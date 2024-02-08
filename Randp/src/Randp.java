import java.util.stream.IntStream;

public class Randp {
    private int[] nums;
    private int numsLeft;

    public Randp(int n) {
        initNums(n);
    }

    private void initNums(int n) {
        nums = IntStream.rangeClosed(1, n).toArray();
        randomiseArray(nums, Math.random());

    }

    private void randomiseArray(int[] list, double randomNum) {
    }

    public int nextInt() {
        return 0;
    }
}