package com.demo.loops;

/**
 * Created by udoluweera on 2/1/17.
 */
public class Full_Loop {

    /**
     * Following Loop runs -> N times N
     * That is N + N + N + .... N Times
     * If N is 5 -> 5 + 5 + 5 + 5 + 5 = 25
     * In other words it is N * N = N ^2
     * Here it became N^2 because for each item in the outer loop inner loop runs N times
     * and it doesnt mean you can just multiply inner loop by the outer loop
     *
     *
     *
     * @param n
     */
    private static void full_Loop(int n) {

        int count = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.printf("  i is [%s] and j is [%s] and count is [%s] \n", i, j, count);

                count = count + 1;

            }
        }
    }

    /**
     *
     * Here inner loop runs (N-1) times always as it is start with one and
     * N is always less than the N ( There are some tricks ... see other examples )
     *
     * So for each item in the outer loop inner loop runs N-1 times
     * So it is -> N (N-1)
     * When the N is 5 -> 5 (5-1) = 20
     *
     * @param n
     */
    private static void full_Loop_When_N_Start_With_1(int n) {

        int count = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n; j++) {

                System.out.printf("  i is [%s] and j is [%s] and count is [%s] \n",i,j,count);

                count = count + 1;

            }
        }
    }

    /**
     *
     * Here inner loop starts with one but it goes another round because upper bound is <= n
     * So it is same as looping the outer loop
     *
     * So as the first example for every item in the outer loop inner loop runs n times
     * So it is N * N -> N^2
     * 5*5 -> 25
     *
     * @param n
     */
    private static void full_Loop_When_N_Start_With_1_tick_equals(int n) {

        int count = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.printf("  i is [%s] and j is [%s] and count is [%s] \n",i,j,count);

                count = count + 1;

            }
        }
    }


    public static void main(String[] args) {

        full_Loop(5);

        System.out.println("\n\n");

        full_Loop_When_N_Start_With_1(5);

        System.out.println("\n\n");

        full_Loop_When_N_Start_With_1_tick_equals(5);
    }
}
