package sort;

/**
 * Created by bruce on 2017/5/16.
 */
public class MergeBU extends SortBase {
    private static int[] aux;
    public void sort(int[] a) {
        int n = a.length;
        aux = new int[n];
        for( int sz = 1; sz <= n; sz += sz)
            for( int i = 0; i + sz < n; i += sz + sz )
                merge(a, i, i + sz - 1, Math.min(i + sz + sz - 1, n-1));
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1;
        for(int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        for(int k = low; k <= high; k++) {
            if( i > mid) a[k] = aux[j++];
            else if( j > high) a[k] = aux[i++];
            else if( aux[j] < aux[i]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
}
