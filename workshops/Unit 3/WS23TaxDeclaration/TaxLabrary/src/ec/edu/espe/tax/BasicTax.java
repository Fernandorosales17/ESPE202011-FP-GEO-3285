/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

/**
 *
 * @author Fernando Rosales
 */
public class BasicTax {

    public static float computerIva(float basePrice, float percentageValue) {
        float Iva;
        Iva = basePrice * percentageValue / 100;
        return Iva;
    }

}
