/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

/**
 *
 * @author k57h721
 */
public class ExceptionExample {

   public static void main (String args[]) {
      int array[] = {20,20,40};
      int num1 = 15, num2 = 0;  // make num2 = 0 for the arithmetic exception
      int result = 10;
      // int num3 = 5/num2; // throws an ArithmeticException without me catching it
      /* if (num2 == 0) {
          throw new ArithmeticException("divisor is zero");
      } */
      
      /* if (args.length != 1) {
          throw new IllegalArgumentException("Bad number of arguments");
      }
      */
      //result = num1 / num2;
      try {
         result = num1/num2;
         System.out.println("The result is " + result);
         for(int i = 5; i >= 0; i--) {
            System.out.println("The value of array is" + array[i]);
         }
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array is out of Bounds: "+ e);
      } catch (ArithmeticException e) {
         System.out.println ("Can't divide by Zero: "+ e);
      }
      System.out.println("finished");
   }
   
}
    
