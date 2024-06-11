/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Database;

import VirtualPet.Creature.Pet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jeffe
 */
public class PetManager {
    
    DBManager dbManager;
    
    public static void main(String[] args) {
        PetManager pm = new PetManager();
        
    }
    
    public PetManager()
    {
        dbManager = new DBManager();
        dbManager.establishConnection();
        
        try {
            createPetTable();
        } catch (SQLException ex) {
            Logger.getLogger(PetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void createPetTable() throws SQLException
    {
        Connection conn = dbManager.getConnection();
        if (!dbManager.tableExists(conn, "PET"))
        {
            //create table
            Statement s = conn.createStatement();
            s.execute("CREATE TABLE PET ("
                    + "name VARCHAR(255) NOT NULL PRIMARY KEY,"
                    + "species VARCHAR(255) NOT NULL,"
                    + "sadness INTEGER NOT NULL DEFAULT 0,"
                    + "thirst INTEGER NOT NULL DEFAULT 50,"
                    + "hunger INTEGER NOT NULL DEFAULT 50,"
                    + "bladder INTEGER NOT NULL DEFAULT 50,"
                    + "exercise INTEGER NOT NULL DEFAULT 50,"
                    + "food INTEGER NOT NULL DEFAULT 0,"
                    + "water INTEGER NOT NULL DEFAULT 0)");
            
        }
    }
    
//    public void insertPet() throws SQLException {
//        Connection conn = dbManager.getConnection();
//        Statement s = conn.createStatement();
//        
//        s.execute("INSERT INTO PET VALUES ("
//                + "Pet.Attributes.getName()"
//                + "Pet.Attributes.getSpecies(),"
//                + "Pet.Attributes.getSadness(),"
//                + "Pet.Needs.getThirst(),"
//                + "Pet.Needs.getHunger(),"
//                + "Pet.Needs.getBladder(),"
//                + "Pet.Needs.getExcerise(),"
//                + "Pet.Resources.getFood(),"
//                + "Pet.Resources.getWater(),");
//        
//    }
 
    public void insertPet(Pet pet) throws SQLException {
        Connection conn = dbManager.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO PET VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

        // Set values using prepared statement
        ps.setString(1, pet.attributes.getName());
        ps.setString(2, pet.attributes.getSpecies());
        ps.setInt(3, pet.attributes.getSadness());
        ps.setInt(4, pet.needs.getThirst());
        ps.setInt(5, pet.needs.getHunger());
        ps.setInt(6, pet.needs.getBladder());
        ps.setInt(7, pet.needs.getExercise());
        ps.setInt(8, pet.resources.getFood());
        ps.setInt(9, pet.resources.getWater());

        // Execute the update
        ps.executeUpdate();

        // Close the prepared statement (recommended)
        ps.close();

        // Close the connection (important!)
        //conn.close();
    }
    public void updatePet(Pet pet) throws SQLException {
        Connection conn =dbManager.getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE PET SET species = ?, sadness = ?, thirst = ?, hunger = ?, bladder = ?, exercise = ?, food = ?, water = ? WHERE name = ?");

        ps.setString(1, pet.attributes.getSpecies()); // Update values
        ps.setInt(2, pet.attributes.getSadness());
        ps.setInt(3, pet.needs.getThirst());
        ps.setInt(4, pet.needs.getHunger());
        ps.setInt(5, pet.needs.getBladder());
        ps.setInt(6, pet.needs.getExercise());
        ps.setInt(7, pet.resources.getFood());
        ps.setInt(8, pet.resources.getWater());
        ps.setString(9, pet.attributes.getName());  // Set where clause based on primary key

        ps.executeUpdate();

        ps.close();
        //conn.close();
  }

}
