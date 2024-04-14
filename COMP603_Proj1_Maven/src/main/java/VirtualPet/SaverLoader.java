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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SaverLoader {

    public static void save(Pet pet)
    {
        try {
            //create folder for the pet jsons
            if (pet.saveLoadID == null || pet.saveLoadID.isBlank())
            {
                pet.saveLoadID = pet.attributes.getName();
            }
            Path path = Paths.get("./resources/pets/"+pet.saveLoadID);
            Files.createDirectories(path);
            saveJsonFile(path.toString()+"/attributes.json", pet.attributes);
            saveJsonFile(path.toString()+"/resources.json", pet.resources);
            saveJsonFile(path.toString()+"/needs.json", pet.needs);
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static HashMap<String, Pet> loadAll()
    {
        HashMap<String,Pet> petMap = new HashMap();
        
        File petFolder = new File("./resources/pets/");
        
        List<File> dirs = loadDirectorys(petFolder);
        
        for (File directory : dirs) {  
            if(doesDirHaveReqJson(directory))
            {
                Attributes attributes = null;
                Needs needs = null;
                Resources resources = null;
                
                File[] files = directory.listFiles();
                
                for (File file : files) {
                    switch (file.getName())
                    {
                        case "attributes.json":
                            attributes = loadJsonFile(file.toString(), Attributes.class);
                            break;
                        
                        case "resources.json":
                            resources = loadJsonFile(file.toString(), Resources.class);
                            break;
                            
                        case "needs.json":
                            needs = loadJsonFile(file.toString(), Needs.class);
                            break;
                            
                        default:
                            break;
                    }
                }

                Pet pet;
                //all required files are there, load pet, find class

                switch (attributes.getSpecies()) {
                    case "Cat":
                        pet = new Cat(attributes, resources, needs);
                        pet.saveLoadID = directory.getName(); //set to current dir name to make sure we save from where we loaded.
                        petMap.put(pet.saveLoadID, pet);
                        break;

                    case "Dog":
                        pet = new Dog(attributes, resources, needs);
                        pet.saveLoadID = directory.getName(); //set to current dir name to make sure we save from where we loaded.
                        petMap.put(pet.saveLoadID, pet);
                        break;
                        
                    case "Hamster":
                        pet = new Hamster(attributes, resources, needs);
                        pet.saveLoadID = directory.getName(); //set to current dir name to make sure we save from where we loaded.
                        petMap.put(pet.saveLoadID, pet);
                        break;
                        
                    case "Rabbit":
                        pet = new Rabbit(attributes, resources, needs);
                        pet.saveLoadID = directory.getName(); //set to current dir name to make sure we save from where we loaded.
                        petMap.put(pet.saveLoadID, pet);
                        break;
                        
                    default:
                        System.out.println("Species unknown cannot load pet");
                        break;
                }
            }
        } 
        return petMap;
    }
    
    private static List<File> loadDirectorys(File path)
    {
        List<File> dirs = Arrays.stream(path.listFiles())
                .filter(File::isDirectory)
                .collect(Collectors.toList());
        
        return dirs;
    }
    
    private static boolean doesDirHaveReqJson(File directory)
    {
        File[] files = directory.listFiles();
        
        int dirHasFiles = 0;
        
        if(files != null)
        {
            for (File file : files) {
                if (file.getName().equals("attributes.json")) {
                    System.out.println("Found attributes.json in directory: " + directory.getName());
                    //attributes = loadJsonFile(file.toString(), Attributes.class);
                    dirHasFiles += 1;
                } else if (file.getName().equals("resources.json")) {
                    System.out.println("Found resources.json in directory: " + directory.getName());
                    //resources = loadJsonFile(file.toString(), Resources.class);
                    dirHasFiles += 2;
                } else if (file.getName().equals("needs.json")) {
                    System.out.println("Found needs.json in directory: " + directory.getName());
                    //needs = loadJsonFile(file.toString(), Needs.class);
                    dirHasFiles += 3;
                }
                if(dirHasFiles == 6)
                {
                    return true;
                }
            }
        }
        return false;
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
        String jsonData = "";
        
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader inStream = new BufferedReader(fileReader);
            
            
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
        try {
            return gson.fromJson(jsonData, clazz);
        } catch (Exception e) {
            System.out.println("Error occured loading json into class");
            return null;
        }
    }
    
    
    static Pet loadPet(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
