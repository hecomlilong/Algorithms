package sort;

import util.Stopwatch;

/**
 * Created by Bruce on 3/4/2017.
 */
public class SortTest {
    public static void main(String[] args) {
        int[] a = {7,6,5,4,3,2,1};
        int[] b = {1,2,3,4,5,6};
        sort(a);
        sort(b);
        int N = 10000*4;
        int[] t = new int[N];
        for(int i = N-1;i>=0;i--) {
            t[i] = (N-i) % 3;
        }

        Stopwatch stopwatch = new Stopwatch();
        Selection.sort(t);
        double t1 = stopwatch.elapsedTime();
        N = 10000 * 10;
        int[] tt = new int[N];
        for(int i = N-1;i>=0;i--) {
            tt[i] = (N-i) % 3;
        }
        Stopwatch stopwatch2 = new Stopwatch();
        Insertion.sort(tt);

        double t2 = stopwatch2.elapsedTime();

        System.out.println(t1);
        System.out.println(t2);
    }
    public static void sort(int[] a) {
        int N = a.length;
        int count = 0;
        for (int i = 1; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++){
                if (a[j] < a[min]) {
                    min = j;
                    count++;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
        System.out.println(count);
    }
}
