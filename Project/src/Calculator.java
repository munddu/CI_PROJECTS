/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
/**
 *
 * @author umar
 */
public class Calculator {
    double a,b;
    public Calculator(double x, double y){
        a = x;
        b = y;
    }
   
   public double add(){
       double sum = a+b;
       return sum;
   }
   public double subtract(){
       double result = a-b;
       return result;
   }
   public double multiply(){
       double result1 = a*b;
       return result1;
   }
    public double divide(){
       double result2 = a/b;
       return result2;
   }
}
