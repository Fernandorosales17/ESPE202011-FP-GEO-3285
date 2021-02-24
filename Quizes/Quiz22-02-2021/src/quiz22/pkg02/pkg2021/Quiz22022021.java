/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz22.pkg02.pkg2021;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Quiz22022021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] candidate;
        String[] namesOfCandidates = {"Andrés Arauz ->32.7% ", "Guillermo Lasso ->19.75%", "Yaku Pérez ->19.38%", "Xavier Hervas ->15.69%", "Pedro Freile ->2.08%",
            "Isisdro Romero ->1.86%", "Luicio Gutiérrez ->1.78%", "Gerson Alméida ->1.73%", "Ximena Peña ->1.54%", "Guillermo Celi ->0.91%"};
        Scanner input = new Scanner(System.in);
        int n = 10;
        System.out.println("Enter the number of elections ");
        n = input.nextInt();

        candidate = new int[n];

//        float candidato[0] = 32.7%;
//        float candidato[1] = 19.75%;
//        float candidato[2] = 19.38%;
//        float candidato[3] = 15.69%;
//        float candidato[4] = 2.08%;
//        float candidato[5] = 1.86%;
//        float candidatos6] = 1.78%;
//        float candidato[7] = 1.73%;
//        float candidato[8] = 1.54%;
//        float candidato[9] = 0.91%;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of candidates " + (i + 1) + " -> ");
            candidate[i] = input.nextInt();

        }

        for (int i = 0; i < n; i++) {
            System.out.println("Names of candidates " + (i + 1) + " -> " + candidate[i]);

        }
        for (String nameCandidate : namesOfCandidates) {
            System.out.println("Votes porcentage -> " + nameCandidate);
        }

    }

}
