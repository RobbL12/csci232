/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newexceptionexample;

import java.util.Scanner;

/**
 *
 * @author k57h721
 */
public class NewExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IncorrectIntegerException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        if (num > 10) {
            throw new IncorrectIntegerException("Number entered: "
                                 + num + "is not within limits");
        }
    }
    
}
