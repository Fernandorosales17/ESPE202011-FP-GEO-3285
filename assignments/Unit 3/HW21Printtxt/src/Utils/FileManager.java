/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class FileManager {

   public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(data + System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;

        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    
    }
   public static String read(String filepetshop) {
        filepetshop = null;
        String text = null;
        String document = "C:\\Users\\Usuario\\Desktop\\progra\\codigos\\ESPE202011-FP-GEO-3285\\workshops\\Unit 3\\WS27ADT\\PetShop.csv";
        try ( BufferedReader textBr = new BufferedReader(new FileReader(document))) {
            while ((filepetshop = textBr.readLine()) != null) {
                text = filepetshop;
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return text;
    }

 }
