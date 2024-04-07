/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet;


/**
 *
 * @author jeffe
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;

public class SaverLoader {
    
    public static void save(Pet[] pets)
    {
        try {
            //Gson gson = new Gson();
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            String jsonString = gson.toJson(pets);
            
            
            
            // Write JSON to file
            FileWriter file = new FileWriter("./resources/data.json");
            file.write(jsonString);
            file.flush();
            file.close();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
