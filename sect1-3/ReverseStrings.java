/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import csci232library.StackOfStrings;

/**
 *
 * @author k57h721
 */
public class ReverseStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // read the strings from a file
        File file = new File(args[0]);
        
        Scanner inpFile = new Scanner(file);
        
        int max = 1000;
        
        StackOfStrings stack = new StackOfStrings(max);
        
        int i = 0;
        while(inpFile.hasNext()){
           stack.push(inpFile.next());
        }
        
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    
}
