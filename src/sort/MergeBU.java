package sort;

/**
 * Created by bruce on 2017/5/16.
 */
public class MergeBU extends SortBase {
    public void sort(int[] a) {
        int n = a.length;
        for( int sz = 1; sz <= n; sz += sz)
            for( int i = 0; i + sz < n; i += sz + sz )
                Merge.merge(a, i, i + sz - 1, Math.min(i + sz + sz - 1, n-1));
    }
}
