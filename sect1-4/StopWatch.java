/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Taken from Algorithms, 4th edition, by by Robert Sedgewick and Kevin Wayne 
 */
package csci232library;

/**
 *
 * @author k57h721
 */
public class StopWatch {

    private final long start;

    /**
     * Initializes a new stopwatch.
     */
    public StopWatch() {
        start = System.currentTimeMillis();
    } 


    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
    
}
