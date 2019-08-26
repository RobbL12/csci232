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
      int num1 = 15, num2 = 0;
      int result = 10;
      //result = num1 / num2;
      try {
         result = num1/num2;
         System.out.println("The result is" + result);
         for(int i = 5; i >= 0; i--) {
            System.out.println("The value of array is" + array[i]);
         }
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array is out of Bounds: "+ e);
      } catch (ArithmeticException e) {
         System.out.println ("Can't divide by Zero: "+ e);
      }
   }
}
    
