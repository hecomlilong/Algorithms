package sort;

/**
 * Created by bruce on 2017/5/15.
 */
public class Heap extends SortBase {
    public void sort(int[] pq) {
        int n = pq.length-1;
        for (int k = n/2; k >= 0; k--)
            sink(pq, k, n);
        while (n > 0) {
            swap(pq, 0, n--);
            sink(pq, 0, n);
        }
    }

    private static void sink(int[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            swap(pq, k, j);
            k = j;
        }
    }
}
