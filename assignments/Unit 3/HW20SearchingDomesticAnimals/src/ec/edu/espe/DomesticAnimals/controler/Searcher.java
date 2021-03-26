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
public class Searcher {

    public int findCharacter(String[] Characteres, String dataCharacteres) {

        int n = Characteres.length;
        for (int i = 0; i < n; i++) {
            if (Characteres[i] == null ? dataCharacteres == null : Characteres[i].equals(dataCharacteres)) {

                return i;
            }
        }
        return -1;
    }
}
