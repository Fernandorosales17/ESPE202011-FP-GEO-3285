/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperation;

/**
 *
 * @author Usuario
 */
public class Basicoperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  //variable declaration
  int sum;
  int addend1; 
  int addend2;
  
  int minuend;
  int subtrahend;
  int difference;
      
  int produc;
  int multiplicant; 
  int multiplier;
  
  int divisor;
  int dividend;
  int quotient;
  
  minuend = -23;
  subtrahend = -6;
  difference = -17;
  multiplicant = 13;
  multiplier = 6;
  divisor = 15;
  dividend = 5; 
  
    //initialization
    addend1 = 5;
    addend2 = 18; 
  
    
    //oparation 
    sum = addend1 + addend2;
    
    System.out.println("the eddition off" + addend1 + " + " + addend2 + 
            " is aqual to --> " + sum);
    
    ++sum;
    System.out.println("sum is equal to --> " + sum);
    
    sum++;
    System.out.println("sum is equal to --> " + sum);
    
    System.out.println("adding one to sum" + (sum++));
    
     System.out.println("adding one to sum" + ((++sum)));
    
     
    System.out.println("the subtraction of" + minuend + "-" + subtrahend + 
            "is equal to" + (minuend - subtrahend));
    
    --minuend;
    System.out.println("minuend is equal to-->" + minuend);
    
    }
    
}
