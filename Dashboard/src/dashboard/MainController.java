/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Click
 */
public class MainController implements Initializable {

    @FXML
    private Button btnOne;
    @FXML
    private Button btnTwo;
    @FXML
    private AnchorPane Anchorpane;
    @FXML
    private Button btnHome;
    @FXML
    private Text text;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        text.setText("Main");
        Anchorpane.setStyle("-fx-background-color: #8e44ad");
    }

    @FXML
    private void OpenSlideOne(ActionEvent event) {

        try {
            Parent newRoot = FXMLLoader.load(getClass().getResource("/dashboard/SlideOne.fxml"));
            setAnchore(newRoot);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OpenSlideTwo(ActionEvent event) {

        try {
            Parent newRoot = FXMLLoader.load(getClass().getResource("/dashboard/SlideTwo.fxml"));
            setAnchore(newRoot);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void home(ActionEvent event) {
        Anchorpane.getChildren().clear();
        Anchorpane.setStyle("-fx-background-color: #8e44ad");
        text.setText("Main");
        Anchorpane.getChildren().add(text);
    }

    private void setAnchore(Parent root) {
        text.setText("");
        if (Anchorpane.getChildren().isEmpty()) {
            Anchorpane.getChildren().add(root);
        } else {
            Anchorpane.getChildren().clear();
            Anchorpane.getChildren().add(root);
        }
        
    }
}
