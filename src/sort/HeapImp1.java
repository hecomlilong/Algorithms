package sort;

/**
 * Created by bruce on 2017/5/24.
 */
public class HeapImp1 extends SortBase {
    public void sort(int[] pq) {
        int n = pq.length - 1;
        for(int k = n / 2; k >= 0; k--) {
            sink(pq, k, n);
        }

        while(n > 0) {
            SortTestHelper.swap(pq, 0, n--);
            sink(pq, 0, n);
        }
    }

    public static void sink(int[] pq, int k, int n) {
        int e = pq[k];
        while( 2*k <= n) {
            int j = 2*k;
            if(j < n && less(pq, j, j+1)) j++;
            if(e >= pq[j]) break;
            pq[k] = pq[j];
            k = j;
        }
        pq[k] = e;
    }
}
