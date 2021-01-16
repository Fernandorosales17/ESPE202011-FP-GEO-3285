/*
 * To change this license header, choose License Headers in Project Properties:
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WS07menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                    break;
                case 2:
                    int difference;
                    int subtrahend;
                    int minuend;
                    
                    System.out.println("enter minuend -> ");
                    minuend = input.nextInt();
                    System.out.println("enter subtrahend -> ");
                    subtrahend = input.nextInt();
                    difference = minuend - subtrahend;
                    System.out.println("the difference is --> " + difference);
                    System.out.println("The subtraction is --> ");
                    
                    break;
                case 3:
                    int product;
                    int multiplicant;
                    int multiplier;
                    
                    System.out.println("enter multiplier -> ");
                    multiplier = input.nextInt();
                    System.out.println("enter multiplicant -> ");
                    multiplicant = input.nextInt();
                    product = multiplicant * multiplier;
                    System.out.println("The product is -->" + product);
                     System.out.println("The multiplication is --> ");
                    
                    break;
                case 4:
                   
                    int quotient;
                    int divisor;
                    int dividend;
                    System.out.println("enter divisor -> ");
                    divisor = input.nextInt();
                    System.out.println("enter dividend -> ");
                    dividend = input.nextInt();
                    quotient = dividend / divisor;
                    System.out.println("The quotient is -->" + quotient);
                    System.out.println("The division is --> ");
                    
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    
            }

        } while (option != 5);

    }

}