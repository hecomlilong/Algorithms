package sort;

import java.util.Arrays;

/**
 * Created by Bruce on 3/4/2017.
 */
public class Shell extends SortBase{
    public void sort(int[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = h * 3 + 1;
        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && a[j] < a[j-h];j--) {
                    SortTestHelper.swap(a, j, j-h);
                }
            }
            h = h / 3;
        }
    }

    public static void sort(Double[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = h * 3 + 1;
        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && a[j] < a[j-h];j--) {
                    Double tmp = a[j];
                    a[j] = a[j-h];
                    a[j-h] = tmp;
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {

    }
}
