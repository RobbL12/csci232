/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author k57h721
 */
public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal anim = new Animal();
        System.out.println("Finished creating the animal");
        Dog maemae = new Dog();
        System.out.println("finished creating maemae");
        Dog bear = new Dog("bear");
        bear.print();
        System.out.println("before candy");
        Animal candy = new Animal();
        candy.print();
        candy = bear;
        candy.print();
        
        
        
    }
    
}
