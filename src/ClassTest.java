import java.util.Arrays;

/**
 * Created by bruce on 2017/4/7.
 */

public class ClassTest {
    public static void main(String[] args) {
        int[] a = {1,31,2,32,3,33,4,34,5,35};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        sort3way(a, 0, a.length - 1);
    }

    public static void sort3way(int [] a, int low , int high) {
        if(low >= high) return;
        int lt = low, i = low + 1, gt = high;
        int v = a[low];
        while(i <= gt) {
            if(a[i] < v) {
                int tmp = a[lt];
                a[lt] = a[i];
                a[i] = tmp;
                i++;lt++;
            }else if(a[i] > v) {
                int tmp = a[gt];
                a[gt] = a[i];
                a[i] = tmp;
                gt--;
            }else{
                i++;
            }
        }
        sort3way(a, low, lt - 1);
        sort3way(a, gt + 1, high);
    }
}
