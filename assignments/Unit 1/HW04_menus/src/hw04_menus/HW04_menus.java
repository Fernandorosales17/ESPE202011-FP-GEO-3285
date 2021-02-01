/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04_menus;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HW04_menus {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> perimeter of the square");
            System.out.println("2. -> Multiplication Tables : 12");
            System.out.println("3. -> Pentagon perimeter");
            System.out.println("4. -> Downward collation from 30 to 0 ");
            System.out.println("5. -> Exit"); 

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

            case 1:
            Scanner sc = new Scanner (System.in);
                    int Side1;
                    int Side2;
                    int Side3;
                    int Side4;
                    int perimeter;
                    System.out.println("enter side 1");
                    Side1 = input.nextInt();
                    System.out.println("enter Side 2 -> ");
                    Side2 = input.nextInt();
                    System.out.println("enter Side 3 -> ");
                    Side3 = input.nextInt();
                    System.out.println("enter Side 4 -> ");
                    Side4 = input.nextInt();                    
                    perimeter = Side1 + Side2 + Side3 + Side4;
                    System.out.println("Perimeter of square is -->" + 
                            perimeter);
                    break;
            case 2:
            System.out.println("Multiplication Tables : 12");
                 int top=12;
                 int product=1;
                 int table=12;
                 for (int j= 1 ; j<= top ; j++){
                 product = table * j;
            System.out.println("12 *" + j + " = " + product);
                }
                    break;
                    
                    

            case 3: 
                int L1;
                int L2;
                int L3;
                int L4;
                int L5;
                int Perimeter;
                System.out.println("enter L 1 -> ");
                L1 = input.nextInt();
                System.out.println("enter L 2 ->");
                L2 = input.nextInt();
                System.out.println("enter L 3 -> ");
                L3 = input.nextInt();
                System.out.println("enter L 4 -> ");
                L4 = input.nextInt();
                System.out.println("enter L 5 -> ");
                L5 = input.nextInt();                    
                Perimeter = L1 + L2 + L3 + L4 + L5;
                System.out.println("Perimeter of pentagon is -->" + 
                Perimeter);
                
                break;
                    
                    case 4:
        System.out.println("downward collation from 30 to 0");
        int star=30;
        int stop=0;
        for (int j=30 ; j>=stop ; j--) {
            System.out.println(j);
     }

                    break;
                case 5:
                    System.out.println("Good night my friends");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}
