package com.algorithms4.sort;

import com.algorithms4.utils.StdOut;
import com.algorithms4.utils.StdRandom;
import com.algorithms4.utils.Stopwatch;

/**
 * Created by saml on 10/31/2017.
 */
public class SortCompare {

    public static double time(SortType alg, Comparable[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg == SortType.Insertion) {
            InsertionSort.sort(a);
        }
        if (alg == SortType.Selection) {
            SelectionSort.sort(a);
        }
        if (alg == SortType.Shell) {
            ShellSort.sort(a);
        }
        if (alg == SortType.Merge) {
            MergeSort.sort(a);
        }

        //keep for other sort algorithms

        return timer.elapsedTime();
    }

    public static double timeRandomInput(SortType alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < N; j++) {
                a[j] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        double selection_time = timeRandomInput(SortType.Selection, 100000, 1);
        double insertion_time = timeRandomInput(SortType.Insertion, 100000, 1);
        double shell_time = timeRandomInput(SortType.Shell, 100000, 1);
        double merge_time = timeRandomInput(SortType.Merge, 100000, 1);
        double quick_time = timeRandomInput(SortType.Quick, 100000, 1);
        StdOut.printf("For %s, the total time is: %.1f seconds.  \n", SortType.Selection, selection_time);
        StdOut.printf("For %s, the total time is: %.1f seconds.  \n", SortType.Insertion, insertion_time);
        StdOut.printf("For %s, the total time is: %.1f seconds.  \n", SortType.Shell, shell_time);
        StdOut.printf("For %s, the total time is: %.1f seconds.  \n", SortType.Merge, merge_time);
        StdOut.printf("For %s, the total time is: %.1f seconds.  \n", SortType.Quick, quick_time);
    }
}
