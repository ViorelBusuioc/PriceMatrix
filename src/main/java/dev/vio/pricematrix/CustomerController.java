package dev.vio.pricematrix;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CustomerController {

    @FXML
    private GridPane customerW;
    @FXML
    private TextField customerCode;
    @FXML
    private TextField name;
    @FXML
    private ComboBox<String> paymentTerm;
    @FXML
    private ComboBox<String> guarantee;
    @FXML
    private ComboBox<String> currency;
    @FXML
    private ComboBox<String> deliveryCond;
    @FXML
    private ComboBox<String> transportMode;
    @FXML
    private ComboBox<String> segment;
    @FXML
    private ComboBox<String> shipment;

    public void initialize() {

        ObservableList<String> paymentTermOptions = FXCollections.observableArrayList(
                "30 days from invoicing","40 days from invoicing","45 days from invoicing","50 days from invoicing",
                "60 days from invoicing");
        paymentTerm.setItems(paymentTermOptions);
        paymentTerm.getSelectionModel().select(0);

        ObservableList<String> guaranteeOptions = FXCollections.observableArrayList(
                "Yes","No");
        guarantee.setItems(guaranteeOptions);
        guarantee.getSelectionModel().select(1);

        ObservableList<String> currencyOptions = FXCollections.observableArrayList(
                "RON","EUR","USD");
        currency.setItems(currencyOptions);
        currency.getSelectionModel().select(1);

        ObservableList<String> deliveryOptions = FXCollections.observableArrayList(
                "FCA","DAP","FOB","CIP","CIF","CFR","EXW");
        deliveryCond.setItems(deliveryOptions);
        deliveryCond.getSelectionModel().select(1);

        ObservableList<String> transportOptions = FXCollections.observableArrayList(
                "Truck","Wagon","Ship");
        transportMode.setItems(transportOptions);
        transportMode.getSelectionModel().select(0);

        ObservableList<String> segmentOptions = FXCollections.observableArrayList(
                "Shipbuilding","SSC","Stockists","Energy Pipes & Tubes","Civil Engineering","Trader","Wind Mill/Power Plants",
                "Machinery","Rail & Wagon Building","Yellow Goods","Road, Rail, Bridge & Tunnels","Metal Furniture","Pressure Vessels",
                "Light Trailers / Caravans","Wire & Cable","Boilers","Others (Metal Processing)");
        segment.setItems(segmentOptions);
        segment.getSelectionModel().select(1);

        ObservableList<String> shipmentOptions = FXCollections.observableArrayList(
                "Librex","Call of","Agreed Shipment");
        shipment.setItems(shipmentOptions);
        shipment.getSelectionModel().select(0);
    }

    public Customer customerProcessed() {

        String cCodeInput = customerCode.getText().trim();
        String customerNameInput = name.getText().trim();
        String paymentTermInput = paymentTerm.getValue();
        String guaranteeInput = guarantee.getValue();
        String currencyInput = currency.getValue();
        String deliveryCondInput = deliveryCond.getValue();
        String transportModeInput = transportMode.getValue();
        String segmentInput = segment.getValue();
        String shipmentInput = shipment.getValue();

        return new Customer(cCodeInput,customerNameInput,paymentTermInput,guaranteeInput,currencyInput,
                deliveryCondInput,transportModeInput,segmentInput,shipmentInput);

    }


}
