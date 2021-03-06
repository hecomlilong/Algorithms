package sort;

/**
 * Created by bruce on 2017/5/14.
 */

import util.Stopwatch;

import java.util.Random;

/**
 * Created by bruce on 2017/5/14.
 */
public class SortTestHelper {

    public static int[] generateRandomArray(int n, int low, int high) {
        if (n <= 0 || low > high) {
            return new int[0];
        }
        int[] result = new int[n];

        Random rand = new Random();

        int len = result.length;
        int edge = high - low;

        for (int i = 0; i < len; i++) {
            result[i] = rand.nextInt(edge) + low;
        }
        return result;
    }

    public static int[] generateNearlyOrderedArray(int n, int swapTimes) {
        if(n <= 0) {
            return new int[0];
        }
        int[] result = new int [n];
        for(int i = 0; i < n; i++) {
            result[i] = i;
        }
        Random rand = new Random();
        for(int i = 0; i < swapTimes; i++) {
            swap(result,rand.nextInt(n-1),rand.nextInt(n-1));
        }
        return result;
    }

    public static int[] copy(int[] a) {
        int N = a.length;
        int [] result = new int[N];
        for(int i=0; i < N; i++) {
            result[i] = a[i];
        }
        return result;
    }

    public static void swap(int[] obj, int a, int b) {
        int tmp = obj[a];
        obj[a] = obj[b];
        obj[b] = tmp;
    }

    public static int randomInt(int n) {
        Random rand = new Random();
        return rand.nextInt(n);
    }
}

