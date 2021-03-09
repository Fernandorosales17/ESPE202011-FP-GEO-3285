/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws20jar_ejecution;

import java.util.Scanner;

/**
 *
 * @author Fernando Rosales
 */
public class WS20Jar_Ejecution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number entered is even");
        } else {
            System.out.println("The number entered is odd");
        }
        System.out.println("Autor**Rebeca Sandoval");
    }

    private static class is {

        public is() {
        }
    }

    private static class enter {

        public enter() {
        }
    }

    private static class number {

        public number() {
        }
    }
}
