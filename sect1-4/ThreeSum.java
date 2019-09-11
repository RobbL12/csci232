/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Taken from Algorithms, 4th edition - by Robert Sedgewick and Kevin Wayne 
 */

/******************************************************************************
 *  
 *  Data files:   
 *  A program with cubic running time. Reads n integers
 *  and counts the number of triples that sum to exactly 0
 *  (ignoring integer overflow).
 * % java ThreeSum 8ints.txt
 * 4
 *  
 * % java ThreeSum 1Kints.txt 
 *  70
 *
 *  % java ThreeSum 2Kints.txt 
 *  528
 *
 *  % java ThreeSum 4Kints.txt 
 *  4039
 *
 ******************************************************************************/

package threesum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import csci232library.StopWatch;

/**
 *
 * @author k57h721
 */
public class ThreeSum {

 
    /**
     * Returns the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param  a the array of integers
     * @return the number of triples (i, j, k) with {@code i < j < k}
     *         such that {@code a[i] + a[j] + a[k] == 0}
     */
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    } 

    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  { 
        
        File file = new File(args[0]);
        
        Scanner scanner = new Scanner(file);
        
        int max = Integer.parseInt(args[1]);
        int [] a = new int[max];
        int i = 0;
        
        while (scanner.hasNextInt()) {
            a[i++] = scanner.nextInt();
        }

        StopWatch timer = new StopWatch();
        int count = count(a);
        System.out.println("elapsed time = " + timer.elapsedTime());
        System.out.println(count);
    } 
} 
