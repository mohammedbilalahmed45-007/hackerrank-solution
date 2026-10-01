import java.util.*;
public class MarkAndToys {
    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        int count = 0, spent = 0;
        for (int price : prices) {
            if (spent + price > k) break;
            spent += price;
            count++;
        }
        return count;
    }
}
