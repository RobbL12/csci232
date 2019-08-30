/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generictest;

/**
 *
 * @author k57h721
 */
public class GenericTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gen<Integer> genInt = new Gen<Integer>(15);
        genInt.genericPrint();
        Gen<String> genStr = new Gen<String>("string");
        genStr.genericPrint();
        Gen<Double> genDbl = new Gen<Double>(1.5);
        genDbl.genericPrint();
        
        
    }
    
}
