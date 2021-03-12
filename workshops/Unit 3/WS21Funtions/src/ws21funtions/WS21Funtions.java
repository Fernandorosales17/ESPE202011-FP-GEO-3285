/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21funtions;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class WS21Funtions {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        double ranges;
        double f;
        double c;
        double k;
        do {
            System.out.println("Autor**Rosales Luis");
            System.out.print("Introduce temperatura en ºC: ");
            temperatura = scanner.nextDouble();
            System.out.println("Grados Kelvin ..: " + (temperatura + 273));

            ranges = scanner.nextDouble();
        } while (ranges == 'S' || ranges == 's');

        System.out.print("Ingrese grados fahrenheit: ");

        f = scanner.nextDouble();

        c = (f - 32) * 5 / 9;

        k = (f - 32) * 5 / 9 + 273;

        System.out.printf("Los grados cel son: %.3f \n Los grados kel son: %.3f", c, k);
        
    }

}
