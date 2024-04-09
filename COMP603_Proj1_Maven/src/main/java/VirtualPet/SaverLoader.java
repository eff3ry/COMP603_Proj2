/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet;


/**
 *
 * @author jeffe
 */

import VirtualPet.Creature.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaverLoader {

    public static void save(Pet pet)
    {
        try {
            //create folder for the pet jsons
            Path path = Paths.get("./resources/"+pet.attributes.name);
            Files.createDirectories(path);
            
            
            // Write JSON to file
//            FileWriter file = new FileWriter("./resources/data.json");
//            file.write(jsonString);
//            file.flush();
//            file.close();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static String generateJson(Object obj)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(obj);
    }
    
    private static boolean saveJsonFile(String path, Object obj)
    {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            PrintWriter pw = new PrintWriter(fos);
            
            pw.println(generateJson(obj));
            
            pw.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File cannot be found at " + path);
            return false;
        }
        return true;
    }
        
    private static <T> T loadJsonFile(String path, Class<T> clazz)
    {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader inStream = new BufferedReader(fileReader);
            
            String jsonData = "";
            String line = null;
            while ((line=inStream.readLine())!=null){
                jsonData += line;
                System.out.println(line);
            }
            inStream.close();
            
        } catch (FileNotFoundException e)
        {
            System.out.println("File cannot be found at " + path);
            return null;
        } catch (IOException ex) {
            System.out.println("An error has occured while trying to read " + path);
            return null;
        }
        
        Gson gson = new Gson();
        return gson.fromJson(path, clazz);
    }
    
    
    static Pet loadPet(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
