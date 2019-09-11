package binarysearch_time;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import csci232library.StopWatch;

public class BinarySearch_Time {

    /**
     * This class should not be instantiated.
     */
    private BinarySearch_Time() { }

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
        int key = 1000000;
        
        Scanner inpFile = new Scanner(file);
        StopWatch timer = new StopWatch();
        
        int [] whitelist = new int [Integer.parseInt(args[1])];
        int i = 0;
        while(inpFile.hasNextInt()){
           whitelist[i++] = inpFile.nextInt();
        }

        // sort the array
        Arrays.sort(whitelist);
        StopWatch timer1 = new StopWatch();
        // read integer key from standard input; print if not in whitelist
        
        if (BinarySearch_Time.indexOf(whitelist, key) != -1) {
            System.out.println("Found the key");
        }
        else {
            System.out.println("Did not find the key");
        }
        
        System.out.println("elapsed time (full) = " + timer.elapsedTime());
        System.out.println("elapsed time (just search) = " + timer1.elapsedTime());

    }
}

