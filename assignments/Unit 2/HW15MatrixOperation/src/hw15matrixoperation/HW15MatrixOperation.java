/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrixoperation;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=*=*=*=HELLO=*=*=*=");
        System.out.println("=*=*=*=I´M STUDENT OF THE ESPE=*=*=*=");
        System.out.println("=*=*=*=MY NAME IS LUIS FERNANDO=*=*=*=");
        System.out.println("=*=*=*=WELCOME TO THE MATRIX SUBTRACTION=*=*=*=");

        int rows;
        System.out.println("---Enter the rows of the arrays---");
        rows = input.nextInt();
        int columns;
        System.out.println("---Enter the columns of the arrays---");
        columns = input.nextInt();

        int matrixA[][] = new int[rows][columns];;
        int matrixB[][] = new int[rows][columns];;
        int matrixSubtraction[][] = new int[rows][columns];

        System.out.println("Matrix A data:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter a number for the position: a[" + i + "][" + j + "] " + " matrix A --> ");
                matrixA[i][j] = input.nextInt();

            }

        }

        System.out.println("Matrix B data:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter a number for the position: b[" + i + "][" + j + "] " + " matrix B --> ");
                matrixB[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix structure A");
        System.out.println(" -------------- ");
        for (int[] matrixA1 : matrixA) {
            for (int j = 0; j < matrixA1.length; j++) {
                System.out.print("\t " + matrixA1[j]);
            }
            System.out.println();
        }
        System.out.println(" ------------- ");
        System.out.println();
        System.out.println("Matrix structure B");
        System.out.println(" ------------- ");
        for (int[] matrixB1 : matrixB) {
            for (int j = 0; j < matrixB1.length; j++) {
                System.out.print("\t " + matrixB1[j]);
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixSubtraction[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        System.out.println(" ------------- ");
        System.out.println("\n The subtraction of the matrices is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("\t" + matrixSubtraction[i][j]);
            }
            System.out.println();

            System.out.println();
            System.out.println("***********GOOD BYE**************");
            System.out.println("*****THANKS FOR CHOOSING US*****");
            System.exit(0);

        }

    }

}