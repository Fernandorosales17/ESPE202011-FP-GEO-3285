/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw07funtions;

import java.util.Scanner;

/**
 *
 * @author Fernando Rosales
 */
public class HW07Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE

        Scanner input = new Scanner(System.in);
        int divd;
        int divr;
        float quotient = 0;
        int x = 0;
        int y = 0;
        int multiplicand;
        int product;
        int top = 12;
        System.out.println("**************HELLO***************");
        System.out.println("****I´M STUDENT OF THE ESPE****");
        System.out.println("***MY NAME IS LUIS FERNANDO***");
        System.out.println("***********WELCOME***********");
        System.out.println("1)****Enter*to*divition*******");
        System.out.println("Enter the divd -->");
        divd = input.nextInt();

        System.out.println("Enter the divr -->");
        divr = input.nextInt();

        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient is -> " + quotient);

        System.out.println("2)*****Enter Number Squared*****");
        x = input.nextInt();
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

        System.out.println("3)*****Enter a number for equation******");
        x = input.nextInt();
        y = g(x);
        System.out.println("the value of -> " + x + " <- is equal to -> " + y);

        System.out.println("4)*****Enter Multiplication table*****");
        multiplicand = input.nextInt();
        for (int multiplier = 1; multiplier <= top; multiplier++) {
            product = gettable(multiplicand, multiplier);
            System.out.println(multiplicand + " x " + multiplier + " = " + product);

        }
        System.out.println("***********GOOD BYE**************");
        System.out.println("*****THANKS FOR CHOOSING US*****");

    }

    public static float divideTwoNumbers(int divd, int divr) {

        float quotient = 0.0F;

        quotient = (float) divd / (float) divr;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

    public static int gettable(int multiplicand, int multiplier) {
        int product;

        product = multiplicand * multiplier;

        return product;
    }

}
