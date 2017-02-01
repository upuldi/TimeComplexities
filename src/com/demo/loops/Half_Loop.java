package com.demo.loops;

/**
 * Created by udoluweera on 2/1/17.
 */
public class Half_Loop {


    /**
     *
     * Here we cant simply multiply inner loop into outer loop, Pls refer the full loop example
     *
     * Here inner loop no of repetitions reduce by one when every time outer loop executed,
     * So at first inner loop executes N times and then N-1 times and then N - 2 times.
     * So we have to calculate the no of counts of inner loop and outer loop separately
     *
     * Pattern for the outer loop is (n) + (n-1) + (n-2) ..... 0
     * It is a common formula and it is N(N+1)/2
     *
     * However the inner loop still runs N times irrespective of outer loop, So you have to count that
     * so the answer is N + N(N+1)/2
     *
     * So if the N is 5 the answer is -> 5 + 5(5+1)/2 = 20
     *
     * We have to define the count twice because inner loop does not execute all the times.
     *
     * For Ex :
     *
     * Outer Loop -> 1
     * Inner Loop -> (n-1)
     *
     * Outer Loop -> 2
     * Inner Loop -> (n-2)
     *
     * When the outer loop runs for the nth time inner loop does not executed
     *
     * Outer Loop -> n
     * Inner Loop -> 0
     *
     *  So
     *
     * Outer Loop -> 1,2,3,....,n
     * Inner Loop -> (n-1) + (n-2) + (n-3) + (n-4) + 0
     *
     * So the total should be the sum of both inner and outer loop counts.
     *
     *
     *
     * @param n
     */

    private static void half_Loop(int n) {

        int count = 1;

        for (int i = 0 ; i < n ; i++) {

            for (int j = i ; j < n ; j++ ) {

                System.out.printf("  i is [%s] and j is [%s] and count is [%s] \n", i, j, count);
                count += 1;

            }

            System.out.printf("  i is [%s] and count is [%s] \n", i, count);
            count += 1;
        }


    }


    public static void main(String[] args) {


        half_Loop(5);

    }

}



