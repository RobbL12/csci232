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
public class Dog extends Animal {
    
    Dog() {
        System.out.println("I am a dog");
    }
    Dog(String name) {
        System.out.println("I am a dog named " + name);
    }
    void print() {
        System.out.println("inside print for Dog");
        super.print();
    }
    
}
