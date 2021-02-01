package hw02squarearea;

import java.util.Scanner;
public class HW02SquareArea {

    
    public static void main(String[] args) {
   
    try (Scanner leer = new Scanner(System.in)) {
			int ladoa=0, ladob=0;
			System.out.println("Ingrese el lado a: ");
			ladoa=leer.nextInt ();       
			System.out.println("Ingrese el lado b: ");
			ladob=leer.nextInt ();
                        System.out.println("El area del cuadrado es: " + cuadradoArea(ladoa, ladob));
		}
    } 
    
    private static Int cuadradoArea(int ladoa, int ladob) {
	
		return (int) (ladoa* ladob);
	}
  
}