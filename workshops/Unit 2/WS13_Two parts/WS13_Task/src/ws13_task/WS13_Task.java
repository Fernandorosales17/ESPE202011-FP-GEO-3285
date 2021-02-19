/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13_task;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WS13_Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
         float Perimetro = 6.0F;
        float Apotema = 5.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float absoluteValue;
        
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("=*=*=*=HELLO=*=*=*=");
            System.out.println("=*=*=*=IÂ´M STUDENT OF THE ESPE=*=*=*=");
            System.out.println("=*=*=*=MY NAME IS LUIS FERNANDO=*=*=*=");
            System.out.println("=*=*=*=WELCOME=*=*=*=");
            System.out.println();
            System.out.println(" ======== OPTION MENU ========= ");
            System.out.println(" _____________ ");
            System.out.println(" _____________ ");
            System.out.println("=*=*=*= 1. Calculator for the area of the Pentagon=*=*=*=");
            System.out.println("=*=*=*= 2. Calculator for the area of the Rhomboid=*=*=*=");
            System.out.println("=*=*=*= 3. Calculator for the area of the Trapezoid=*=*=*=");
            System.out.println("=*=*=*= 4. Exit=*=*=*=");
            System.out.println(" _____________ ");
            System.out.println(" _____________ ");
            System.out.println(" Enter an option ");
            opcion = input.nextInt();
            switch (opcion) {

                case 1:
                    get_the_area_of_pentagon(input);
                    break;
                case 2:
                    get_the_area_of_rhomboid(input);
                    break;
                case 3:
                    get_the_area_of_the_trapezoid(input);
                    break;
                case 4:
                    get_exit();
                    break;
                default:
                    
            }

        } while (opcion != 4);
    }

    public static void get_exit() {
        System.out.println("***********GOOD BYE**************");
        System.out.println("*****THANKS FOR CHOOSING US*****");
        System.out.println(":");
        System.exit(0);
    }

    public static void get_the_area_of_the_trapezoid(Scanner input) {
        System.out.println("INGRESE LA BASE MAYOR");
        int base_ma = input.nextInt();
        System.out.println("INGRESE LA BASE MENOR");
        int base_me = input.nextInt();
        System.out.println("INGRESE LA ALTURA");
        int altura_t = input.nextInt();
        System.out.println(" EL AREA DEL TRAPECIO ES :" + areatrapecio(base_ma, base_me, altura_t));
    }

    public static void get_the_area_of_rhomboid(Scanner input) {
        System.out.println("Ingrese la base");
        int base_r = input.nextInt();
        System.out.println("Ingrese la Altura");
        int altura_r = input.nextInt();
        System.out.println(" EL AREA DEL ROMBOIDE ES :" + arearomboide(base_r, altura_r));
    }

    public static void get_the_area_of_pentagon(Scanner input) {
        System.out.println(" Ingrese el Perimetro");
        int perimetro = input.nextInt();
        System.out.println("Ingrese el Apotema");
        int apotema = input.nextInt();
        System.out.println(" EL AREA DEL PENTAGONO ES :" + areapentagono(perimetro, apotema));
    }

    public static int areapentagono(int p, int a) {
        return (p * a) / 2;
    }

    public static int arearomboide(int b, int h) {
        return b * h;
    }

    public static int areatrapecio(int B, int b, int h) {

        return ((B + b) / 2) * h;
    }

}

