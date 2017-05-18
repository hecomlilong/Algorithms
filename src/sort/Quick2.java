package sort;

/**
 * Created by bruce on 2017/5/17.
 */
public class Quick2 extends SortBase {

    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int low, int high) {
        if(low >= high) return;
        int mid = partition(a, low, high);
        sort(a, low, mid - 1);
        sort(a, mid + 1, high);
    }

    public static int partition(int[] a, int low, int high) {
        int i = low + 1, j = high;
        SortTestHelper.swap(a,low,SortTestHelper.randomInt(high - low + 1) + low);
        int v = a[low];
        while(true) {
            while(i <= high && a[i] < v) i++;
            while(j >= low + 1 && a[j] > v) j--;
            if(i > j) break;
            SortTestHelper.swap(a,i,j);
            i++;
            j--;
        }
        SortTestHelper.swap(a, low, j);
        return j;
    }

}
