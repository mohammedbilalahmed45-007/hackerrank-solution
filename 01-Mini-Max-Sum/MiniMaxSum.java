import java.util.*;
public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long total = 0, min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        for (int x : arr) {
            total += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        System.out.println((total - max) + " " + (total - min));
    }
}
