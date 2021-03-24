/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw19searchingform;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class HW19SearchingForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "º Numbers :", 0));
        }
        String chain = "✼✼✼Unordered numbers✼✼✼ \n";
        for (int i = 0; i < numbers.length; i++) {
            chain = chain + numbers[i] + "    ";
        }
        Insercion(numbers);
        chain = chain + "\n ✼✼✼Ordered Numbers✼✼✼ ";
        for (int i = 0; i < numbers.length; i++) {
            chain = chain + "\n" + numbers[i];

        }
        JOptionPane.showMessageDialog(null, chain);
    }

    public static void Insercion(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int aux = numbers[i];
            int position = i;
            while ((position > 0) && (numbers[position - 1] > aux)) {
                numbers[position] = numbers[position - 1];
                position--;
            }
            numbers[position] = aux;
        }

    }

}
