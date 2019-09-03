/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Taken from Algorithms, 4th edition, y Robert Sedgewick and Kevin Wayne 
 */
package stackofstringsapp;

/******************************************************************************
 *  
 *  % more tobe.txt 
 *  to be or not to - be - -
 * 
 *  % java FixedCapacityStackOfStrings 
 *  to be or not to - be - -
 *  to be not
 *
 *  Remark:  bare-bones implementation. Does not do repeated
 *  doubling or null out empty array entries to avoid loitering.
 *
 ******************************************************************************/

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import csci232library.StackOfStrings;
import csci232library.ListStack;
import java.io.File;
import java.io.FileNotFoundException;



public class StackOfStringsApp {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in = new Scanner(System.in);
        
        int max = 1000;
        
        String item;
        
        
        StackOfStrings stack = new StackOfStrings(max);
        
        // ListStack stack = new ListStack();
        
        
        // read the strings from a file
        File file = new File(args[0]);
        
        Scanner inpFile = new Scanner(file);
        
        int i = 0;
        while(inpFile.hasNext()){
           item = inpFile.next();
        
            if (!item.equals("-")) stack.push(item); 
            else if (stack.isEmpty())  System.out.println("BAD INPUT"); 
            else                       System.out.print(stack.pop() + " ");
        }

        // print what's left on the stack
        System.out.print("\nLeft on stack: ");
        for (String s : stack) {
        // for (Object s : stack) {
            System.out.print(s + " ");
        }
        System.out.println();
    } 
} 
