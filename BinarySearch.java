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
    public static int indexOf(int[] a, int key, int size) {
        int lo = 0;
        int hi = size - 1;
        
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            System.out.println("key is " + key + " a[mid] is " + a[mid]);
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    private static void show(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Reads in a sequence of integers from the whitelist file, specified as
     * a file as a command-line argument; reads another set of integers also from
     * a file as a command line argument.  It then
     * prints to standard output those integers that do <em>not</em> appear in the first file.
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
        System.out.println("Before sort");
        show(whitelist, i);
        // sort the array
        Arrays.sort(whitelist, 0, i);
        System.out.println("After sort");
        show(whitelist, i);

        file = new File(args[1]);
        Scanner keyFile = new Scanner(file);
        // read integer key from standard input; print if not in whitelist
        while (keyFile.hasNextInt()) {
            int key = keyFile.nextInt();
            System.out.println("searching for key" + key);
            if (BinarySearch.indexOf(whitelist, key, i) == -1)
                System.out.println(key);
        }
    }
}

