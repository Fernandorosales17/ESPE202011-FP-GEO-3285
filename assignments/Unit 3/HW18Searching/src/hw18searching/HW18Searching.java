/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

import static java.util.Arrays.binarySearch;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.search;

/**
 *
 * @author Fernando Rosales
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1,3,5,7,9,12,15,18,21,24};
        int n = arr.length;
        int x;
        int result;
        System.out.println("=*=*=*=HELLO WELCOME=*=*=*=");
        System.out.println("=*=*=*=I´M STUDENT OF THE ESPE=*=*=*=");
        System.out.println("=*=*=*=MY NAME IS LUIS FERNANDO=*=*=*=");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("☜ 1,3,5,7,9,12,15,18,21,24 ☞");
        System.out.println("Enter a element");
        
        x = input.nextInt();
        result = BinarySearch.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Item not found ");
        } else {
            System.out.println("Element found in position " + result);
        }
        System.out.println("Enter element");
        x = input.nextInt();
        result = LinearSearch.search(arr, x);
        if (result == -1) {
            System.out.println("Item not found ");
             System.out.println("✼THANK YOU FOR CHOOSING US✼");
        } else {
            System.out.println("Element found in position " + result);
            System.out.println("✼THANK YOU FOR CHOOSING US✼");
        }
    }
}
