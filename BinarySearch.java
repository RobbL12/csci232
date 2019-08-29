/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;  // needed for calling the sort method
import java.util.Scanner;

/**
 *
 * @author k57h721
 */
public class BinarySearch {   

    /**
     * This class should not be instantiated.
     */
    private BinarySearch() { }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param  a the array of integers, must be sorted in ascending order
     * @param  key the search key
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    /**
     * Reads in a sequence of integers from the whitelist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        // read the integers from a file
        File file = new File(args[0]);
        
        Scanner inpFile = new Scanner(file);
        
        int [] whitelist = new int [100];
        int i = 0;
        while(inpFile.hasNextInt()){
           whitelist[i++] = inpFile.nextInt();
        }

        // sort the array
        Arrays.sort(whitelist);

        file = new File(args[1]);
        Scanner keyFile = new Scanner(file);
        // read integer key from standard input; print if not in whitelist
        while (keyFile.hasNextInt()) {
            int key = keyFile.nextInt();
            if (BinarySearch.indexOf(whitelist, key) == -1)
                System.out.println(key);
        }
    }
}

