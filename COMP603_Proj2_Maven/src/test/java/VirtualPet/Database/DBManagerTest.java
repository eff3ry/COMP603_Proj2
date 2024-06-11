/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package VirtualPet.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeffe
 */
public class DBManagerTest {
    
    public DBManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class DBManager.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DBManager.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getConnection method, of class DBManager.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        DBManager instance = new DBManager();
        Connection result = instance.getConnection();
        assertNotNull(result);
        
    }

    /**
     * Test of establishConnection method, of class DBManager.
     */
    @Test
    public void testEstablishConnection() {
        System.out.println("establishConnection");
        DBManager instance = new DBManager();
        instance.establishConnection();
        
        Connection result = instance.getConnection();
        assertNotNull(result);
    }

    /**
     * Test of closeConnections method, of class DBManager.
     */
    @Test
    public void testCloseConnections() {
        System.out.println("closeConnections");
        DBManager instance = new DBManager();
        instance.closeConnections();
        try {
            
            assertTrue(instance.getConnection().isClosed());
        } catch (SQLException ex) {
            fail();
        }
    }

    /**
     * Test of tableExists method, of class DBManager.
     */
    @Test
    public void testTableExists() throws Exception {
        System.out.println("tableExists");
        DBManager dbm = new DBManager();
        Connection conn = dbm.getConnection();
        String tableName = "PET";
        boolean result = DBManager.tableExists(conn, tableName);
        boolean expected = true;
        assertEquals(expected, result);
        
    }
    
}
