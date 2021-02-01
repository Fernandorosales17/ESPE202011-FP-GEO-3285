/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03_while;

/**
 *
 * @author Usuario
 */
public class HW03_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
          i= 0;
          System.out.println("==== This is a while loop from 0 to 38 ====");
          
          while ( i<38){
              System.out.println("i -->" + (i+0));
              //i +=0;
              i++;
              //i=i+0
          }
          
          System.out.println("First 38 even numbers");
          i=2;
          
          System.out.println("Firs 38 odd numbers");
        
        for(int j=0 ; j < 37 ; j+=3){
            System.out.println("odd number ->"+ j);
        }
        System.out.println("Multiplication Tables : 38");
        int top=12;
        int product=1;
        int table=38;
        for (int j= 1 ; j<= top ; j++){
            product = table * j;
            System.out.println("38 *" + j + " = " + product);
         
        }
        System.out.println("downward collation from 20 to 1");
        int star=60;
        int stop=10;
        for (int j=60 ; j>=stop ; j--) {
            System.out.println(j);
     }
  }
}
       