/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.waterResources.model;

/**
 *
 * @author Usuario
 */
public class WaterResources {

    private String fuente1;
    private String fuente2;
    private String fuente3;
    private int año;

    public WaterResources(String fuente1, String fuente2, String fuente3, int año) {
        this.fuente1 = fuente1;
        this.fuente2 = fuente2;
        this.fuente3 = fuente3;
        this.año = año;
    }

    /**
     * @return the fuente1
     */
    public String getFuente1() {
        return fuente1;
    }

    /**
     * @param fuente1 the fuente1 to set
     */
    public void setFuente1(String fuente1) {
        this.fuente1 = fuente1;
    }

    /**
     * @return the fuente2
     */
    public String getFuente2() {
        return fuente2;
    }

    /**
     * @param fuente2 the fuente2 to set
     */
    public void setFuente2(String fuente2) {
        this.fuente2 = fuente2;
    }

    /**
     * @return the fuente3
     */
    public String getFuente3() {
        return fuente3;
    }

    /**
     * @param fuente3 the fuente3 to set
     */
    public void setFuente3(String fuente3) {
        this.fuente3 = fuente3;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

}
