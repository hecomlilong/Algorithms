package sort;

import util.Stopwatch;

import java.util.Random;

/**
 * Created by bruce on 2017/5/14.
 */

public class SortBase {
    public void sort(int[] a) {

    }
    public static boolean isSorted(int[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++) {
            if(a[i] < a[i - 1]) return false;
        }
        return true;
    }

    public static boolean less(int[] obj, int a, int b) {
        return obj[a] < obj[b];
    }

    public void testSort(int [] a) {
        Stopwatch timer = new Stopwatch();

        sort(a);
        assert isSorted(a);
        System.out.println(this.getClass().getName()+":"+timer.elapsedTime()+'s');
    }
}
