/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02squarearea;

/**
 *
 * @author Usuario
 */
public class SquareAreafloat {
    

    
    public static void main(String[] args) {
   
    try (Scanner leer = new Scanner(System.in)) {
			float ladoa=0, ladob=0;
			System.out.println("Ingrese el lado a: ");
			ladoa=leer.nextFloat ();       
			System.out.println("Ingrese el lado b: ");
			ladob=leer.nextFloat ();
                        System.out.println("El area del cuadrado es: " + cuadradoArea(ladoa, ladob));
		}
    } 
    
    private static Float cuadradoArea(float ladoa, float ladob) {
	
		return (float) (ladoa* ladob);
	}
  
}
