package ru.sapteh.controller;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sapteh.dao.DAO;
import ru.sapteh.daoipml.RadioElementsImpl;
import ru.sapteh.model.RadioElements;

import java.util.List;

public class Controller {

    @FXML
    private TableView<RadioElements> mainTableView;

    @FXML
    private TableColumn<RadioElements, Integer> idColumn;

    @FXML
    private TableColumn<RadioElements, String> nameColumn;

    @FXML
    private TableColumn<RadioElements, String> manufacturerColumn;

    @FXML
    private TableColumn<RadioElements, String> descriptionColumn;

    @FXML
    private TableColumn<RadioElements, Integer> quantityColumn;

    @FXML
    private TableColumn<RadioElements, String> costColumn;

    @FXML
    private Button newButton;

    private final ObservableList<RadioElements> radioList = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory()){
            DAO<RadioElements, Integer> radioElementsDAO = new RadioElementsImpl(factory);
            List<RadioElements> list = radioElementsDAO.findByAll();
            radioList.addAll(list);

            idColumn.setCellValueFactory(c -> new SimpleObjectProperty<>(c.getValue().getId()));
            mainTableView.setItems(radioList);
        }
    }

}