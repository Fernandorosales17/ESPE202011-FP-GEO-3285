/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05_factorial;

import java.util.Scanner;

/**
 * 66
 *
 * @author Fernando Rosales
 */
public class HW05_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number N:");
        System.out.println("Exit:");
        int n = sc.nextInt();
        int number = 1;
        int i = 1;
        do {
            number = number * i;
            i++;
        } while (i <= n);

        System.out.println("the factorial is:" + number);
        System.out.println("--Good-Bye--");
        System.exit(0);
        System.out.println("Invalid 16");

         
}
}

