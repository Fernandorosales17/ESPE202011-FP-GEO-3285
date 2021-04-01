/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.waterResources.controller;

import Utils.FileManager;
import ec.edu.espe.waterResources.model.WaterResources;

/**
 *
 * @author Usuario
 */
public class WaterResourcesController {
    public void save(WaterResources waterResources){
        
        String data = waterResources.getFuente1()+ " ; " + waterResources.getFuente2() + " ; " + waterResources.getFuente3() + " ; " + waterResources.getAño();
        FileManager.save(data, "waterResources");
    }
   public String[] read(){
        String[] data= new String[FileManager.returnSize("waterResources.csv")];
        data = FileManager.read("waterResources.csv");
        return data;
    }
    
}
