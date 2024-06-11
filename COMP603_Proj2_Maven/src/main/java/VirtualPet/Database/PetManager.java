/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Database;

import java.sql.Connection;
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
        try {
            pm.createPetTable();
        } catch (SQLException ex) {
            Logger.getLogger(PetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public PetManager()
    {
        dbManager = new DBManager();
        dbManager.establishConnection();
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
   
    
}
