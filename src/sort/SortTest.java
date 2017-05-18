package sort;

import java.util.Arrays;

/**
 * Created by Bruce on 3/4/2017.
 */
public class SortTest {
    public static void main(String[] args) {
        int n = 100000;
        Quick qq = new Quick();
        int[] a = SortTestHelper.generateRandomArray(n,0,n);
//        int[] a = SortTestHelper.generateNearlyOrderedArray(n,10);
//        System.out.println(Arrays.toString(a));
        int[] b = SortTestHelper.copy(a);
        int[] c = SortTestHelper.copy(a);
        int[] d = SortTestHelper.copy(a);
        int[] e = SortTestHelper.copy(a);
        int[] f = SortTestHelper.copy(a);
        int[] g = SortTestHelper.copy(a);
        int[] h = SortTestHelper.copy(a);
        int[] i = SortTestHelper.copy(a);
        int[] j = SortTestHelper.copy(a);
        int[] k = SortTestHelper.copy(a);
//        qq.testSort(a);
//        Insertion ii = new Insertion();
//        ii.testSort(b);
//        InsertionImp1 ii1 = new InsertionImp1();
//        ii1.testSort(d);
//        Selection ss = new Selection();
//        ss.testSort(c);
//        Heap hh = new Heap();
//        hh.testSort(e);
//        Merge mm = new Merge();
//        mm.testSort(f);
//        MergeImp1 mm1 = new MergeImp1();
//        mm1.testSort(g);
//        MergeBU mbu = new MergeBU();
//        mbu.testSort(h);
        Quick2 qq2 = new Quick2();
        qq2.testSort(i);

        QuickAnother qa = new QuickAnother();
        qa.testSort(j);
        Quick3Ways qq3 = new Quick3Ways();
        qq3.testSort(i);
    }



}
