/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08_recurcive;

/**
 *
 * @author Usuario
 */
public class HW08_Recurcive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
System.out.println("**WELCOME**");
        System.out.println("*My Name is Fernando*");
     String word = "HELLO";
        System.out.print(invesWord(word,word.length()-1));

        System.out.println("**Bye**");
    }
    
    public static String invesWord(String word, int longuitud){
        if(longuitud==0){
            return ""+ word.charAt(longuitud);
        }else{
            return word.charAt(longuitud)+(invesWord(word,longuitud-1));
            
        }
    }
}