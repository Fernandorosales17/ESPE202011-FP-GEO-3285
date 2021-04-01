/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.PetShop.controller;

import Utils.FileManager;
import ec.edu.espe.PetShop.model.Cat;

/**
 *
 * @author Usuario
 */
public class CatController {

    public void save(Cat cat) {

        String data = cat.getColor() + " ; " + cat.getName() + " ; " + cat.getAge() + " ; " + cat.getSterile() + " ; ";
        FileManager.save(data, "cat");
    }

    public String read() {
        String data;
        data = FileManager.read("cat");
        return data;
    }

}
