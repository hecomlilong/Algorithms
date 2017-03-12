package sort;

import java.util.Arrays;

/**
 * Created by Bruce on 2/28/2017.
 */
public class Quick {
    public static void main(String[] args){
        int[] a = {1,31,2,32,3,33,4,56,7,88,9,100};
        sort3way(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static int partition(int[] a, int low, int high){
        int i = low;
        int j = high+1;
        int v = a[low];
        while(true){
            while(a[++i] < v) if(i==high) break;
            while(a[--j] > v) if(j==low) break;
            if(i>=j) break;
            int tmp = a[j];
            a[j] = a[i];
            a[i] = tmp;
        }
        int tmp = a[j];
        a[j] = a[low];
        a[low] = tmp;
        return j;
    }

    public static void sort(int[] a, int low, int high){
        if(low >= high) return;
        int m = partition(a, low, high);
        sort(a,low,m-1);
        sort(a,m+1,high);
    }

    public static void sortOptimize(int[] a, int low, int high){
        if(low + 5 >= high){
            Insertion.sort(a,low,high);
            return;
        }
        int m = partition(a, low, high);
        sort(a,low,m-1);
        sort(a,m+1,high);
    }

    public static int partition(Double[] a, int low, int high){
        int i = low;
        int j = high+1;
        Double v = a[low];
        while(true){
            while(a[++i] < v) if(i==high) break;
            while(a[--j] > v) if(j==low) break;
            if(i>=j) break;
            Double tmp = a[j];
            a[j] = a[i];
            a[i] = tmp;
        }
        Double tmp = a[j];
        a[j] = a[low];
        a[low] = tmp;
        return j;
    }

    public static void sort(Double[] a, int low, int high){
        if(low >= high) return;
        int m = partition(a, low, high);
        sort(a,low,m-1);
        sort(a,m+1,high);
    }

    public static void sort(Double[] a) {
        sort(a, 0, a.length-1);
    }

    public static void sort3way(int[] a, int low, int high) {
        if(low >= high) return;
        int lt = low, i = low + 1, gt = high;
        int v = a[low];
        while(i <= gt) {
            if ( a[i] < v) {
                int tmp = a[lt];
                a[lt] = a[i];
                a[i] = tmp;
                lt++;i++;
            } else if( a[i] > v ) {
                int tmp = a[gt];
                a[gt] = a[i];
                a[i] = tmp;
                gt--;
            } else {
                i++;
            }
        }
        sort(a, low, lt - 1);
        sort(a, gt + 1, high);
    }
}
