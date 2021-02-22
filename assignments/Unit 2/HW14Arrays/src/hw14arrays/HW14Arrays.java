/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" HELLO WELCOME TO MENU");
            System.out.println("My name´s Fernado");
            System.out.println("* 1.acuaticAnimals *");
            System.out.println("2. flying animals");
            System.out.println("* 3. Exit * ");
            System.out.println("**Enter menu option -->");
            option = input.nextInt();
            switch (option) {

                case 1: {
                    int[] aquaticAnimals;
                    String[] animals = {"Squid", "Seal", "Crab", "Surubí", "Dolphin", "Sea turtle",
                        "Sperm whale", "Butterfly fish", "Blue whale", "Parrotfish"};

                    int n;
                    System.out.println("Enter the numbers of the animals aquatic");
                    n = input.nextInt();

                    aquaticAnimals = new int[n];
//        animalsaquitc[0] = 4;
//        animalsaquitc[1] = 5;
//        animalsaquitc[2] = 6;
//        animalsaquitc[3] = 7;
//        animalsaquitc[4] = 8;
//        animalsaquitc[5] = 6;
//        animalsaquitc[6] = 2;

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter the numbers of the animals" + (i + 1) + " -> ");
                        aquaticAnimals[i] = input.nextInt();
                    }

                    for (int animal : aquaticAnimals) {
                        System.out.println("animal of aquatic are " + animal);
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("number of the animal" + (i + 1) + " -> " + aquaticAnimals[i]);
                    }

                    for (String animal : animals) {
                        System.out.println("animals name -> " + animal);
                    }

                }

                case 2: {

                    int[] flyingAnimals;
                    String[] animals = {"The cockatoo", "The Eagle", "The toucan", "The flamenco", "The moth"};

                    int n;
                    System.out.println("Enter the name of the animals flying");
                    n = input.nextInt();

                    flyingAnimals = new int[n];

//        animalsflying[0] = 4;
//        animalsflying[1] = 5;
//        animalsflying[2] = 6;
//        animalsflying[3] = 7;
//        animalsflying[4] = 8;
//        animalsflying[5] = 2;
//        animalsflying[6] = 1;
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter the name of the animals" + (i + 1) + " -> ");
                        flyingAnimals[i] = input.nextInt();
                    }

                    for (int animal : flyingAnimals) {
                        System.out.println("animal of flying" + animal);
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("number of the animal" + (i + 1) + " -> " + flyingAnimals[i]);
                    }

                    for (String animal : animals) {
                        System.out.println("animals name -> " + animal);
                    }

                }

                case 3: {
                    System.out.println("Bye :)");
                    System.exit(0);
                }

            }
        } while (option != 3);
    }
}
