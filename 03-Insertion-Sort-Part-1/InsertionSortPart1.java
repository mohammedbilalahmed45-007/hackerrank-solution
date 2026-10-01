import java.util.*;
public class InsertionSortPart1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        int key = arr.get(n - 1), i = n - 2;
        while (i >= 0 && arr.get(i) > key) {
            arr.set(i + 1, arr.get(i));
            print(arr);
            i--;
        }
        arr.set(i + 1, key);
        print(arr);
    }
    private static void print(List<Integer> arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
