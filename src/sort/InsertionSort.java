package sort;

import java.util.Arrays;

/**
 * Created by Bruce on 2/28/2017.
 */
public class InsertionSort {
    public static void main(String[] args){
        int[] a = {2,435,3,45,6,22,1120,8588};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){
        int N = a.length;
        for(int i = 0; i < N; i++){
            for(int j = i; j > 0 && a[j] < a[j-1];j--){
                int tmp = a[j];
                a[j] = a[j-1];
                a[j-1] = tmp;
            }
        }
    }

    public static void sort(int[] a, int low, int high){
        for(int i = low; i < high + 1;i++){
            for(int j = i; j > 0 && a[j] < a[j-1];j--){
                int tmp = a[j];
                a[j] = a[j-1];
                a[j-1] = tmp;
            }
        }
    }
}
