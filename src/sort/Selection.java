package sort;

/**
 * Created by Bruce on 3/4/2017.
 */
public class Selection extends SortBase {
    public void sort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++){
                if (a[j] < a[min])
                    min = j;
            }
            SortTestHelper.swap(a, i, min);
        }
    }
    public static void sort(Double[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++){
                if (a[j] < a[min])
                    min = j;
            }
            Double tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
    }
}
