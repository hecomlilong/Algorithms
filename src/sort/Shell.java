package sort;

import java.util.Arrays;

/**
 * Created by Bruce on 3/4/2017.
 */
public class Shell {
    public static void sort(int[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = h * 3 + 1;
        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && a[j] < a[j-h];j--) {
                    int tmp = a[j];
                    a[j] = a[j-h];
                    a[j-h] = tmp;
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
        int[] a = {1,321,3,5,65,77,88,998,934,5342,4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
