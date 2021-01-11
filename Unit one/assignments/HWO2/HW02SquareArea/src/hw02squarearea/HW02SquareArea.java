package hw02squarearea;

import java.util.Scanner;
public class HW02SquareArea {

    
    public static void main(String[] args) {
   
    try (Scanner leer = new Scanner(System.in)) {
			short ladoa=0, ladob=0;
			System.out.println("Ingrese el lado a: ");
			ladoa=leer.nextShort ();       
			System.out.println("Ingrese el lado b: ");
			ladob=leer.nextShort ();
                        System.out.println("El area del cuadrado es: " + cuadradoArea(ladoa, ladob));
		}
    } 
    
    private static Short cuadradoArea(short ladoa, short ladob) {
	
		return (short) (ladoa* ladob);
	}
  
}