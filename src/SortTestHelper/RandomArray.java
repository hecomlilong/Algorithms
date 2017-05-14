package SortTestHelper;

import org.omg.CORBA.SystemException;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by bruce on 2017/5/14.
 */
public class RandomArray {
    public static int[] generate(int n, int low, int high) {
        if(n <= 0 || low > high) {
            return new int[0];
        }
        int[] result = new int[n];

        Random rand = new Random();

        int len = result.length;
        int edge = high - low;

        for(int i = 0; i < len; i++) {
            result[i] = rand.nextInt(edge) + low;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = generate(1000,0,100);
        System.out.println(Arrays.toString(a));
    }
}
