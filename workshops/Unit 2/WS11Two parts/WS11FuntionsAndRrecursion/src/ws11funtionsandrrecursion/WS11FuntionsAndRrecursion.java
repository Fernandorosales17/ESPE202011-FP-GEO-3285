/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11funtionsandrrecursion;

/**
 *
 * @author Usuario
 */
public class WS11FuntionsAndRrecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE

        int number = 5;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);

    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
    }
}
