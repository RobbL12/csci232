/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * modified from textbook: Algorithms, 4th Edition by Robert Sedgewick and Kevin Wayne
 */
package csci232library;

/**
 *
 * @author k57h721
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackOfStrings implements Iterable<String> {
    private String[] a;  // holds the items
    private int N;       // number of items in stack

    // create an empty stack with given capacity
    public StackOfStrings(int capacity) {
        a = new String[capacity];
        N = 0;
    }

    public boolean isEmpty() {  
        return N == 0;                    
    }
    
    public boolean isFull() {  
        return N == a.length;             
    }
    
    public void push(String item) {
        a[N++] = item;                    
    }
    
    public String pop() {  
        return a[--N];                    
    }
    
    public String peek() {
        return a[N-1];                    
    }
    
    public Iterator<String> iterator() { 
        return new ReverseArrayIterator(); 
    }

    public class ReverseArrayIterator implements Iterator<String> {
        private int i = N-1;

        public boolean hasNext() {
            return i >= 0;
        }

        public String next() { 
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
} 


