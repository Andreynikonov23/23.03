package ru.sapteh.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Parent;
import org.hibernate.cfg.Configuration;
import ru.sapteh.Dao.Dao;
import ru.sapteh.daoimpl.Radio_Elementsdaoimpl;
import ru.sapteh.model.Radio_Elements;

import java.awt.*;
import java.io.IOException;

public class CreateWindowController {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Dao<Radio_Elements,Integer> radio_elementsIntegerDao = new Radio_Elementsdaoimpl(factory);

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField manufacturerTextField;

    @FXML
    private TextField descriptionTextField;

    @FXML
    private TextField quantityTextField;

    @FXML
    private TextField costTextField;

    @FXML
    private Button okButton;


}






