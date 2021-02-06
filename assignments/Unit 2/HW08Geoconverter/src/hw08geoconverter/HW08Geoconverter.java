/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08geoconverter;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HW08Geoconverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {

            System.out.println("Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“â€˜Ã¢â€“â€™*        WELCOME TO GEOCONVERTER       *Ã¢â€“â€˜Ã¢â€“â€™Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†\n"
                    + "Ã¢â€“Ë†                         VERSION 0.1                             Ã¢â€“Ë†\n"
                    + "Ã¢â€“Ë†                       20 JANUARY 2021                           Ã¢â€“Ë†\n"
                    + "Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë† Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†Ã¢â€“Ë†\n"
                    + "                   Transformer of units of length                \n"
                    + "_______________________");

            System.out.println("  What would you like to do? ");
            System.out.println("Ã¢â€“â€™ 1.  Kilometers to meters.");
            System.out.println("Ã¢â€“â€™ 2.  Meters to centimeters.");
            System.out.println("Ã¢â€“â€™ 3.  Meters to millimeters");
            System.out.println("Ã¢â€“â€™ 4.  Meters to nanometers.");
            System.out.println("Ã¢â€“â€™ 5.  Meters to feet.");
            System.out.println("Ã¢â€“â€™ 6.  Meters to inches.");
            System.out.println("Ã¢â€“â€™ 7.  Centimeters to micrometers.");

            System.out.println("Enter your menu option >> ");

            double kilometers;
            double meters;
            double centimeters;
            double millimeters;
            double nanometers;
            double inches;
            double micrometers;
            double feet;

            option = input.nextInt();

            switch (option) {

                case 1:
                    kiloMetersToMerters(input);
                    break;
                case 2:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    centimeters = meters * 100;
                    System.out.println(meters + " meters is equal to " + centimeters + " centimeters\n ");
                    break;
                case 3:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    millimeters = meters * 1000;
                    System.out.println(meters + " meters is equal to " + millimeters + " millimeters\n ");
                    break;
                case 4:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    nanometers = meters * 1000000000;
                    System.out.println(meters + " meters is equal to " + nanometers + " nanometers\n ");
                    break;

                case 5:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    feet = meters * 3.281;
                    System.out.println(meters + " meters is equal to " + feet + " feet\n ");
                    break;

                case 6:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    inches = meters * 39.37;
                    System.out.println(meters + " meters is equal to " + inches + " inches\n ");
                    break;

                case 7:
                    System.out.println("enter enter the data --> ");
                    centimeters = input.nextDouble();
                    micrometers = centimeters * 10000000;
                    System.out.println(centimeters + " centimeters is equal to " + micrometers + " micrometers\n ");
                    break;

                case 14:
                    System.out.println(" ** GOOD BYE USER ** ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 14);

    }

    public static void kiloMetersToMerters(Scanner input) {
        double kilometers;
        double meters;
        System.out.println("enter enter the data --> ");
        kilometers = input.nextDouble();
        meters = kilometers * 1000;
        System.out.println(kilometers + " Kilometers is equal to " + meters + " meters\n ");
    }

}
