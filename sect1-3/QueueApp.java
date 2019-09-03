/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Taken from Algorithms, 4th edition, y Robert Sedgewick and Kevin Wayne 
 */

/******************************************************************************
 *  
 *
 * 
 *  A generic queue, implemented using a linked list.
 *
 *  % QueueApp tobe_1.txt
 *  to be or not to - be - - that - - - is
 *
 ******************************************************************************/

package queueapp;

import java.util.Scanner;
import csci232library.Queue;
import csci232library.StackOfStrings;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author k57h721
 */
public class QueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Queue<String> queue = new Queue<String>();
        // ***
                
        // read the strings from a file
        File file = new File(args[0]);
        
        Scanner inpFile = new Scanner(file);
        
        String item;
        
        while(inpFile.hasNext()){
           item = inpFile.next();
        
            if (item.equals("-")) {
                System.out.print(queue.dequeue() + " ");
            }
            else {
                queue.enqueue(item);
            }
        }
        
        // print what's left on the stack
        System.out.print("\nLeft on queue: ");
        for (String s : queue) {
        // for (Object s : stack) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
}
