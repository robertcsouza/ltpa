package teste;

import java.sql.*;



public class TestContext {
    
    
    public static Connection Conexao(){
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:teste.db");
        } catch (Exception ex) {
            System.out.println("JDBC nao instalado"+ex.getMessage());
            return null;
        }
        
    }
    
 
}
