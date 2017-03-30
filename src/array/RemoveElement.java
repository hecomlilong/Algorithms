package array;

import java.util.Arrays;

/**
 * Created by bruce on 2017/3/23.
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] a = {1,21,2,32,4,33,4,22,5,45,6,33,4,77,8,19};

        remove(a,20);
        System.out.println(Arrays.toString(a));
        remove(a,22);
        System.out.println(Arrays.toString(a));
    }

    public static int remove(int[] a, int value) {
        int j = 0;
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if(a[i] == value) {
                continue;
            }

            a[j] = a[i];
            j++;
        }

        return j;
    }
}
