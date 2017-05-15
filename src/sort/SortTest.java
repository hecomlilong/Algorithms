package sort;

import java.util.Arrays;

/**
 * Created by Bruce on 3/4/2017.
 */
public class SortTest {
    public static void main(String[] args) {
        int n = 100000;
        Quick qq = new Quick();
        int[] a = qq.generateRandomArray(n,0,n);
//        int[] a = qq.generateNearlyOrderedArray(n,10);
//        System.out.println(Arrays.toString(a));
        int[] b = qq.copy(a);
        int[] c = qq.copy(a);
        int[] d = qq.copy(a);
        int[] e = qq.copy(a);
        qq.testSort(a);
//        Insertion ii = new Insertion();
//        ii.testSort(b);
        InsertionImp1 ii1 = new InsertionImp1();
        ii1.testSort(d);
//        Selection ss = new Selection();
//        ss.testSort(c);
        Heap hh = new Heap();
        hh.testSort(e);
    }



}
