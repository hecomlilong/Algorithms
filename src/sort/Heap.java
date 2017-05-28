package sort;

import java.util.Arrays;

/**
 * Created by bruce on 2017/5/15.
 */
public class Heap extends SortBase {
//    public void sort(int[] pq) {
//        int n = pq.length-1;
//        for (int k = n/2; k >= 0; k--)
//            sink(pq, k, n);
//        while (n > 0) {
//            SortTestHelper.swap(pq, 0, n--);
//            sink(pq, 0, n);
//        }
//    }
//
//    private static void sink(int[] pq, int k, int n) {
//        while (2*k <= n) {
//            int j = 2*k;
//            if (j < n && less(pq, j, j+1)) j++;
//            if (!less(pq, k, j)) break;
//            SortTestHelper.swap(pq, k, j);
//            k = j;
//        }
//    }

    public void sort(int[] pq) {
        int n = pq.length - 1;
        for(int k = n / 2; k >= 0; k--) {
            sink(pq, k, n);
        }
        while( n > 0) {
            SortTestHelper.swap(pq, 0, n--);
            sink(pq, 0, n);
        }
    }

    public static void sink(int[] pq, int k, int n) {
        while( 2*k <= n) {
            int j = 2*k;
            if(j < n && less(pq, j, j+1)) j++;
            if(!less(pq, k, j)) break;
            SortTestHelper.swap(pq, k, j);
            k = j;
        }
    }

    public static void rise(int[] pq, int k) {
        while( k > 1 && less(pq, k / 2, k)) {
            SortTestHelper.swap(pq, k / 2, k);
            k /= 2;
        }
    }

    public static void main(String[] args) {
//        int[] pq = {1,2,3,4,5,6,7,8,9,10};
        int[] pq = {10,9,8,7,6,5,4,3,2,1};
        int n = pq.length - 1;
        for(int k = n / 2; k >= 0; k--) {
            sink(pq, k, n);
        }
        System.out.println(Arrays.toString(pq));
    }
}
