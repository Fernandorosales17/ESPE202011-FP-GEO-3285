/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.DomesticAnimals.controler;

/**
 *
 * @author Usuario
 */
public class sortingString {

    public static String[] sort(String[] Characteres) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5 - j; i++) {
                if (Characteres[i].compareTo(Characteres[i + 1]) > 0) {
                    String aux;
                    aux = Characteres[i];
                    Characteres[i] = Characteres[i + 1];
                    Characteres[i + 1] = aux;
                }
            }
        }
        return Characteres;
    }
}
