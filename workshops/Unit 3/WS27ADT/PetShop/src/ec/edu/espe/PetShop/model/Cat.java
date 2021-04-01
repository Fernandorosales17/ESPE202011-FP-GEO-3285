/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.PetShop.model;

/**
 *
 * @author Usuario
 */
public class Cat {
    private String name;
    private String color;
    private int age;  
    private String sterile; 

    public Cat(String name, String color, int age, String sterile) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.sterile = sterile;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the sterile
     */
    public String getSterile() {
        return sterile;
    }

    /**
     * @param sterile the sterile to set
     */
    public void setSterile(String sterile) {
        this.sterile = sterile;
    }

  
    
}
