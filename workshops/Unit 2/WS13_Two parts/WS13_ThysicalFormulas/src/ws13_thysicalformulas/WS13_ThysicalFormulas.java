/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13_thysicalformulas;

import java.util.Scanner;

/**
 *
 * @author Fernando Rosales
 */
public class WS13_ThysicalFormulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE

        Scanner input = new Scanner(System.in);
        String leave = "";
        while (!leave.equalsIgnoreCase("===Leave====")) {

            System.out.println("=*=*=*=HELLO=*=*=*=");
            System.out.println("=*=*=*=IÂ´M STUDENT OF THE ESPE=*=*=*=");
            System.out.println("=*=*=*=MY NAME IS LUIS FERNANDO=*=*=*=");
            System.out.println("=*=*=*=WELCOME=*=*=*=");
            System.out.println(" ======== OPTION MENU ========= ");
            System.out.println("1.=*=*=*=Displacement Formula=*=*=*=");
            System.out.println("2. ====Final speed====");
            System.out.println("3.=*=*=*=Harmonic Movement=*=*=*=");
            System.out.println("4. ====EXIT====");
            leave = input.nextLine();

            if (leave.equals("1")) {
                System.out.println("Displacement Formula");
                computer_displacement_formula(input);
            } else if (leave.equals("2")) {
                System.out.println("Formula Final speed");
                computer_final_Speed(input);
            } else if (leave.equals("3")) {
                System.out.println("Formula Armonico");
                computer_harmonico_moment(input);
            } else if (leave.equals("4")) {
                computerExit();
            }
        }
    }

    private static void computerExit() {
        System.out.println("***********GOOD BYE**************");
        System.out.println("*****THANKS FOR CHOOSING US*****");
        System.exit(0);
    }

    private static void computer_harmonico_moment(Scanner input) {
        System.out.println("Formula: T = 2pi * square root of 1 / g");
        System.out.println("====Enter to two pi====");
        double twoPi = input.nextDouble();
        System.out.println("====Enter to gsquare root of 1 / g====");
        double squarerootof1 = input.nextDouble();
        double outcome = ((twoPi * squarerootof1));
        System.out.println("====ANSWER====");
        System.out.println("Final speed = " + twoPi + "*" + squarerootof1);
        System.out.println("Final speed = " + outcome);
        System.out.println("=============");
    }

    private static void computer_final_Speed(Scanner input) {
        System.out.println("Formula: Final speed = initial velocity - gravity*time");
        System.out.println("====Enter to initial velocity====");
        double initialVelocity = input.nextDouble();
        System.out.println("====Enter to gravity====");
        double gravity = input.nextDouble();
        System.out.println("====Enter to time====");
        double time = input.nextDouble();
        double outcome = ((initialVelocity - gravity) * (time));
        System.out.println("====ANSWER====");
        System.out.println("Final speed = " + initialVelocity + "-" + gravity + "*" + time);
        System.out.println("Final speed = " + outcome);
        System.out.println("=============");
    }

    private static void computer_displacement_formula(Scanner input) {
        System.out.println("Formula: x = initial velocity*time + 1/2 acceleration * time^2 ");
        System.out.println("====Enter to initial velocity====");
        double initialVelocity = input.nextDouble();
        System.out.println("====Enter to time====");
        double time = input.nextDouble();
        System.out.println("====Enter to acceleration====");
        double acceleration = input.nextDouble();
        double outcome = ((initialVelocity * time) + (acceleration / 2) * (time * time));
        System.out.println("====ANSWER====");
        System.out.println("x = " + initialVelocity + "*" + time + " + 1/2 *" + acceleration + " * " + time + "^2");
        System.out.println("x = " + outcome);
        System.out.println("===============");
    }
}
