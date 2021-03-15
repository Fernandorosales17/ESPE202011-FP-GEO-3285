/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrixlibraries;

import static ec.edu.espe.matrix.BasicMatrix.addTwoMatrices;
import static ec.edu.espe.matrix.BasicMatrix.loadMatrix;
import static ec.edu.espe.matrix.BasicMatrix.prettyPrinMatrix;
import static ec.edu.espe.matrix.BasicMatrix.subtractionTwoMatrices;
import static ec.edu.espe.matrix.BasicMatrix.transposed;
import java.util.Scanner;

/**
 *
 * @author Fernando Rosales
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int columns;
        int rows;
        float[][] firstMatrix;
        float[][] secondMatrix;
        float[][] t;
        float[][] matrixC;

        Scanner input = new Scanner(System.in);
        System.out.println("=*=*=*=HELLO=*=*=*=");
        System.out.println("=*=*=*=I´M STUDENT OF THE ESPE=*=*=*=");
        System.out.println("=*=*=*=MY NAME IS LUIS FERNANDO=*=*=*=");
        System.out.println("=*=*=*=WELCOME TO THE MATRIX CALCULATOR=*=*=*=");
        System.out.println("==ENTER THE SQUARE MATRIX==");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("Enter the matrix dimensions");
        System.out.print("---Enter the columns of the arrays---->");
        rows = input.nextInt();

        System.out.print("---Enter the rows of the arrays---->");
        columns = input.nextInt();

        firstMatrix = new float[rows][columns];
        secondMatrix = new float[rows][columns];
        matrixC = new float[rows][columns];
        t = new float[rows][columns];

        System.out.println("====== Enter the elements of the matrix ======");
        firstMatrix = loadMatrix(rows, columns, "FirstMatrix", input);
        secondMatrix = loadMatrix(rows, columns, "SecondMatrix", input);

        for (int tab = 0; tab <= rows / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("FirstMatrix");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");

        prettyPrinMatrix(rows, columns, firstMatrix);
        System.out.println("");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("SecondMatrix");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");

        prettyPrinMatrix(rows, columns, secondMatrix);
        System.out.println("");

        transposed(columns, rows, t, firstMatrix);

        for (int tab = 0; tab <= rows / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("TRANSPOSED MATRIX");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");

        prettyPrinMatrix(rows, columns, t);

        System.out.println("");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("SUBTRACTION FROM THE MATRIX");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
        matrixC = subtractionTwoMatrices(rows, columns, firstMatrix, secondMatrix);

        prettyPrinMatrix(rows, columns, matrixC);

        System.out.println("");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("SUM OF THE MATRIX");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");

        matrixC = addTwoMatrices(rows, columns, firstMatrix, secondMatrix);

        prettyPrinMatrix(rows, columns, matrixC);

        System.out.println("");
        System.out.println(" -----------------------------------");
        System.out.println("-*-*-*-*-*-*-SEE YOU SOON-*-*-*-*-*-*-*-");
        System.out.println("*-*-*-*-*-*-*-HAPPY TO SERVE YOU USER-*-*-*-*-*-*");
        System.exit(0);

    }

}
