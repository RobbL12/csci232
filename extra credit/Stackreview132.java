/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackreview132;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author k57h721
 */
public class Stackreview132 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int size = 20;
        
        Random rand = new Random();
        
        for (int i = 1; i <= size; ++i) {
            stack.push(rand.nextInt(100)+1);  
        }
        
        System.out.println("stack : "  + stack);
        System.out.println("stack: Pop Operation : "  + stack.pop());
        System.out.println("stack : After Pop Operation : "  + stack);
        System.out.println("stack : found 50? : "  + 
                (stack.search(50) >= 0 ? "yes" : "no"));
        System.out.println("Is stack empty?: "  + (stack.isEmpty()? "yes" : "no"));
        
        int sum = 0;
        while (!stack.empty()) {
            System.out.println("Stack size is " + stack.size());
            sum += stack.pop();
        }
        
        System.out.println("Average is " + sum/size);

    }
    
}
