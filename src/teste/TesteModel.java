package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TesteModel {

    Connection conexao;
    
    public TesteModel(){
    
        conexao = TestContext.Conexao();
        
        if(conexao == null){
        
            System.out.println("Banco de dados nao encontrado");
            System.exit(0);
        }

    }
    
    public boolean isConnected(){
    
        try{
        
            return !conexao.isClosed();
        
        }catch(Exception ex){
        
            System.out.println(ex.getMessage());
            return false;
        }
    
    }
    
       public boolean login(String cpf,String senha) throws SQLException{
    
        PreparedStatement ps =null;
        ResultSet rs = null;
        String sql = "select * from usuarios where cpf=? and senha=?";
           
        try{
            ps = conexao.prepareStatement(sql);
            ps.setString(1,cpf);
            ps.setString(2,senha);
            rs = ps.executeQuery();
            
            if(rs.next()){
            return true;
            }
        }catch(Exception ex){
            
            System.out.println(ex.getMessage());
            return false;
        }finally{
        
            ps.close();
            rs.close();
        
        };
        
        return false;
        
    }
    
}
