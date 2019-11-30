
package teste;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLController implements Initializable {

    public TesteModel model = new TesteModel();
    
    @FXML
    private Label status;
    
    @FXML
    private TextField textCpf;
     
    @FXML
    private TextField textSenha;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
        
        if(model.isConnected()){
              status.setText("Conectado!!");  
        }else{
            status.setText("Desconectado!!");
        
        }
    }  
    
    
    public void login(ActionEvent event){
            
        try{
            if(model.login(textCpf.getText().trim(),textSenha.getText().trim()) ){
            
            status.setText("Usuario Logado");
            
            }else{
            
            status.setText("Usuario ou senha errado");
            }
        }catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        
    }
    
}
