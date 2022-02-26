/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declaracaojava;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author jorge
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblTexto;
    private Button lblClick;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblTexto.setText("Eu te amo, morena Linda!");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
