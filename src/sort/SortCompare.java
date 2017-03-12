package sort;
import util.Stopwatch;
import util.StdOut;
import util.StdRandom;
/**
 * Created by Bruce on 3/4/2017.
 */
public class SortCompare {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        if (alg.equals("Shell")) Shell.sort(a);
//        if (alg.equals("Merge")) Merge.sort(a);
        if (alg.equals("Quick")) Quick.sort(a);
//        if (alg.equals("Heap")) Heap.sort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T)
    {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++)
        {
            for (int i = 0; i < N; i++)
                a[i] = StdRandom.uniform();
            total += time(alg,a);
        }
        return total;
    }

    public static void main(String[] args) {
        int N = 10000;
        int T = 5;

        double t1 = timeRandomInput("Insertion",N,T);
        double t2 = timeRandomInput("Quick",N,T);
        double t3 = timeRandomInput("Selection",N,T);
        double t4 = timeRandomInput("Shell",N,T);
        StdOut.printf("For %d random Doubles\n  %s takes %.3f seconds.\n", N, "Insertion", t1);
        StdOut.printf("For %d random Doubles\n  %s takes %.3f seconds.\n", N, "Insertion", t2);
        StdOut.printf("For %d random Doubles\n  %s takes %.3f seconds.\n", N, "Selection", t3);
        StdOut.printf("For %d random Doubles\n  %s takes %.3f seconds.\n", N, "Shell", t4);
    }
}
