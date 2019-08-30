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
public class Gen <T>{
    T obj;
    Gen(T obj) {
        this.obj = obj;
    }
    public void genericPrint() {
        System.out.println(obj.getClass().getName() + " = " + obj);
    }
    
}
