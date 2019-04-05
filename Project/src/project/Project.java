/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author umar
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //double a,b;
        // TODO code application logic here
        //prompt user to select option
        int select;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("select operation:");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("Enter first number");
        double a = scan.nextDouble();
        System.out.println("Enter first number");
        double b = scan.nextDouble();
        System.out.println("Enter choice(1/2/3/4):");
        double choice = scan.nextDouble();
        
        Calculator calc = new Calculator(a,b);
        if(choice == 1){
        System.out.println(calc.add());
        }
        else if(choice == 2){
        System.out.println(calc.subtract());
        }
        else if(choice == 3){
        System.out.println(calc.multiply());
        }
        else if(choice == 4){
        System.out.println(calc.divide());
        }
        else{
        System.out.println("Sorry! Invalid operation selected");
        }
        //obtaining data
        
        
        
    }
    
}
