package ru.sapteh.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sapteh.dao.DAO;
import ru.sapteh.model.RadioElements;
import ru.sapteh.service.RadioElementsService;

public class EditController {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    DAO<RadioElements, Integer> dao = new RadioElementsService(factory);
    RadioElements radioElements = new RadioElements();

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextField textFieldManufacturer;

    @FXML
    private TextField textFieldDescription;

    @FXML
    private TextField textFieldQuantity;

    @FXML
    private TextField textFieldCost;

    @FXML
    void actionOk(ActionEvent event) {

    }

    RadioElements selectedRadioItems = Controller.selectedRadioItems;


    @FXML
    public void initialize(){

        textFieldId.setText(String.valueOf(selectedRadioItems.getId()));


    }

}
