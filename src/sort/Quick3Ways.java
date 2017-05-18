package sort;

/**
 * Created by Bruce on 5/18/2017.
 */
public class Quick3Ways extends SortBase {
    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int low, int high) {
        if( high - low <= 15) {
            Insertion.sort(a, low, high);
            return;
        }

        // partition
        SortTestHelper.swap(a, low, SortTestHelper.randomInt(high - low + 1) + low);
        int v = a[low];

        int lt = low;
        int gt = high + 1;
        int i = low + 1;
        while( i < gt) {
            if(a[i] < v) {
                SortTestHelper.swap(a, lt + 1, i);
                lt++;
                i++;
            } else if ( a[i] > v) {
                SortTestHelper.swap(a, i, gt - 1);
                gt--;
            } else {
                i++;
            }
        }
        SortTestHelper.swap(a, low, lt);
        sort(a, low, lt - 1);
        sort(a, gt, high);
    }
}
