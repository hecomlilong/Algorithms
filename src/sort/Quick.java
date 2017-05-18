package sort;

import java.util.Arrays;
import util.StdRandom;

/**
 * Created by Bruce on 2/28/2017.
 */
public class Quick extends SortBase{

    public static void main(String[] args){
        int[] a = {0,1,2,10,4,5,6,7,8,9,3};
        sort(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public void sort(int[] a) {
//        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }

    public static int partition(int[] a, int low, int high){
        int i = low;
        int j = high+1;
        int v = a[low];
        while(true){
            while(a[++i] < v) {if(i==high) break;}
            while(a[--j] > v) {if(j==low) break;}
            if(i>=j) break;
            SortTestHelper.swap(a, i, j);
        }
        SortTestHelper.swap(a,low,j);
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
    public static void sort3way(int[] a, int low, int high) {//三相切分快速排序，非常适合元素种类不多，而且大量重复的数组。
        if(low >= high) return;
        int lt = low, i = low + 1, gt = high;
        int v = a[low];
        while(i <= gt) {
            if ( a[i] < v) {
                SortTestHelper.swap(a, lt++,i++);
            } else if( a[i] > v ) {
                SortTestHelper.swap(a, gt--,i);
            } else {
                i++;
            }
        }
        sort3way(a, low, lt - 1);
        sort3way(a, gt + 1, high);
    }
}
