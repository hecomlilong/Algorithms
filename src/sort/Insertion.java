package sort;

import java.util.Arrays;

/**
 * Created by Bruce on 2/28/2017.
 */
public class Insertion extends SortBase {
    public static void main(String[] args){
//
    }

    public void sort(int[] a){
        int N = a.length;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0 && a[j] < a[j-1];j--){
                swap(a,j,j-1);
            }
        }
    }


    public static void sort(int[] a, int low, int high){
        for(int i = low; i < high + 1;i++){
            for(int j = i; j > 0 && a[j] < a[j-1];j--){
                swap(a,j,j-1);
            }
        }
    }

    public static void sort(Double[] a){
        int N = a.length;
        for(int i = 0; i < N; i++){
            for(int j = i; j > 0 && a[j] < a[j-1];j--){
                Double tmp = a[j];
                a[j] = a[j-1];
                a[j-1] = tmp;
            }
        }
    }
}
