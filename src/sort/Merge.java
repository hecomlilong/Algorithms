package sort;

import java.util.Arrays;

/**
 * Created by bruce on 2017/4/4.
 */
public class Merge extends SortBase{

    private static int [] aux;

    public static void main(String[] args) {
        int [] a = {6,5,4,3,2,1};
        System.out.println(getRevPairCount(a));
    }

    public void sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int low, int high) {
        if(low >= high) return;
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1;
        for(int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        for(int k = low; k <= high; k++) {
            if( i > mid) a[k] = aux[j++];
            else if( j > high) a[k] = aux[i++];
            else if( aux[j] < aux[i]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static int getRevPair(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1, result = 0;
        for(int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        for(int k = low; k <= high; k++) {
            if(i > mid) {
                j++;
            }
            else if(j > high) i++;
            else if(aux[i] > aux[j]) {
                j++;
                result += mid - i + 1;
            }
            else i++;
        }
        return result;
    }

    public static int getRevPairCount(int[] a, int low, int high) {
        int result = 0;
        if(low >= high) return result;
        int mid = low + (high - low) / 2;
        result += getRevPairCount(a, low, mid);
        result += getRevPairCount(a, mid + 1, high);
        return result + getRevPair(a, low, mid, high);
    }

    public static int getRevPairCount(int[] a) {
        aux = new int[a.length];
        return getRevPairCount(a, 0, a.length - 1);
    }
}
