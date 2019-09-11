/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threesumfast;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import csci232library.StopWatch;

/**
 *
 * @author k57h721
 */
public class Threesumfast {
    
    private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] == a[i-1]) return true;
        return false;
    }
    
    public static int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) count++;
            }
        }
        return count;
    } 
    /**
     * @param args the command line arguments
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
