/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jeffe
 */
public class PetManager {
    
    DBManager dbManager;
    
    public PetManager()
    {
        dbManager = new DBManager();
        dbManager.establishConnection();
    }
    
    private void createPetTable() throws SQLException
    {
        Connection conn = dbManager.getConnection();
        if (!dbManager.tableExists(conn, "pets"))
        {
            //create table
        }
    }
   
    
}
