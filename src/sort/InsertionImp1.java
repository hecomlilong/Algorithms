package sort;

/**
 * Created by bruce on 2017/5/14.
 */
public class InsertionImp1 extends SortBase {
    public void sort(int[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++) {
            int e = a[i];
            int j;
            for(j = i; j > 0 && a[j - 1] > e; j--) {
                a[j] = a[j - 1];
            }
            a[j] = e;
        }
    }
}
