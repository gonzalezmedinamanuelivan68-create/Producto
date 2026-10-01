package com.mycompany.producto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<Product> tvProduct;
    @FXML
    private TableColumn<Product, String> tcName;
    @FXML
    private TableColumn<Product, Double> tcPrice;
    @FXML
    private TableColumn<Product, Integer> tcQuantity;
    

    @FXML
    private TableColumn<Product, String> tcCodigoBarras;

    private ObservableList<Product> productList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tcQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        tcCodigoBarras.setCellValueFactory(new PropertyValueFactory<>("codigoBarras"));

        productList = FXCollections.observableArrayList(
            new Product("Apple", 1.99, 100, "7501000000001"),
            new Product("Pear", 2.99, 200, "7502000000002"),
            new Product("Orange", 3.99, 300, "7503000000003")
        );

        productList.add(new Product("Pineapple", 3.99, 500, "7504000000004"));

        tvProduct.setItems(productList);
    }
}