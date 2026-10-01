import java.util.*;
public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0, count = 0;
        for (int h : candles) {
            if (h > max) { max = h; count = 1; }
            else if (h == max) count++;
        }
        return count;
    }
}
