package array;

import java.util.Arrays;
import sort.Quick;

/**
 * Created by bruce on 2017/3/23.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {1,21,2,32,4,33,4,22,5,45,6,33,4,77,8,19};

        Quick.sort(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));

        int len = remove(a);
        System.out.println(Arrays.toString(Arrays.copyOf(a,len)));
    }

    public static int remove(int[] a) {
        int i;
        int j = 0;
        int len = a.length;

        if(len == 0) {
            return 0;
        }

        for(i = 1; i < len; i++){
            if(a[i] != a[j]){
                a[++j] = a[i];
            }
        }
        return j + 1;
    }
}
