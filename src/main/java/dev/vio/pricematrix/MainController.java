package dev.vio.pricematrix;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.Optional;

public class MainController {
    //tableview and tableview columns;
    @FXML
    private TableView<HeavyPlate> tableView;
    @FXML
    private TableColumn<Integer, Integer> item;
    @FXML
    private TableColumn<HeavyPlate, String> prd;
    @FXML
    private TableColumn<HeavyPlate, Integer> thickness;
    @FXML
    private TableColumn<HeavyPlate, Integer> width;
    @FXML
    private TableColumn<HeavyPlate, Integer> length;
    @FXML
    private TableColumn<HeavyPlate, Double> qty;
    @FXML
    private TableColumn<HeavyPlate, String> weightPerSheet;
    @FXML
    private TableColumn<HeavyPlate, Integer> pieces;
    @FXML
    private TableColumn<HeavyPlate, String> quality;
    @FXML
    private TableColumn<HeavyPlate, String> galvanising;
    @FXML
    private TableColumn<HeavyPlate, String> usTest;
    @FXML
    private TableColumn<HeavyPlate, String> certificates;
    @FXML
    private TableColumn<HeavyPlate, String> zTest;
    @FXML
    private TableColumn<HeavyPlate, Boolean> normalizing;
    @FXML
    private TableColumn<HeavyPlate, Boolean> tuv;
    @FXML
    private TableColumn<HeavyPlate, Boolean> dbs;
    @FXML
    private TableColumn<HeavyPlate, Boolean> sep;
    @FXML
    private TableColumn<HeavyPlate, String> thicknessTolerances;
    @FXML
    private TableColumn<HeavyPlate, String> sulphur;
    @FXML
    private TableColumn<HeavyPlate, String> carbon;
    @FXML
    private TableColumn<HeavyPlate, String> tensileTest;
    @FXML
    private TableColumn<HeavyPlate, String> charpyTest;
    @FXML
    private TableColumn<HeavyPlate, String> cev;
    @FXML
    private TableColumn<HeavyPlate, Double> exwPivot;
    @FXML
    private TableColumn<HeavyPlate, Double> freightCost;
    @FXML
    private TableColumn<HeavyPlate, Double> pivotItemPrice;
    @FXML
    private TableColumn<HeavyPlate, Double> thicknessAndWidthExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> lengthExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> qualityExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> galvanisingExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> usTestExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> certificatesExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> zTestExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> normalizingExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> tuvExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> dbsExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> sepExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> thicknessTolerancesExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> sulphurExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> carbonExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> tensileTestExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> charpyTestExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> cevExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> plateUnitWeightExtra;
    @FXML
    private TableColumn<HeavyPlate, Double> effectiveFCAPrice;
    @FXML
    private TableColumn<HeavyPlate, Double> effectiveDAPPrice;
    @FXML
    private TableColumn<HeavyPlate, Double> value;
    @FXML
    private TableColumn<HeavyPlate, Double> variableCost;
    @FXML
    private TableColumn<HeavyPlate, Double> contribution;

    // Labels
    @FXML
    private Label totalQty;
    @FXML
    private Label totalValue;
    @FXML
    private Label nameLabel;
    @FXML
    private Label cCodeLabel;
    @FXML
    private Label paymentTermLabel;
    @FXML
    private Label guaranteeLabel;
    @FXML
    private Label currencyLabel;
    @FXML
    private Label deliveryCondLabel;
    @FXML
    private Label transportModeLabel;
    @FXML
    private Label segmentLabel;
    @FXML
    private Label shipmentLabel;


    // Buttons
    @FXML
    private Button addItem;
    @FXML
    private Button editItem;
    @FXML
    private Button deleteItem;
    @FXML
    private Button customer;

    // Main Window
    @FXML
    private GridPane mainWindow;

    private ProductData productData = new ProductData();

    private ObservableList<HeavyPlate> heavyPlatesItems = FXCollections.observableArrayList();

    public void initialize() {

        productData.addHP(60,2000,6000,14,"L415NE PSL2","Class 3","S1E2","","Z15 (lot)","Yes","No","Yes","No","Class C","0.003% < S ≤ 0.005%","","Tensile test (lot)","","",11.4,527,480);
        productData.addHP(70,2000,12000,4,"S355JOWP","Class 3", "S2E2","","Z25 (mother plate)","Yes","No","Yes","No","","","","","","",11.4,527,504);
        productData.addHP(80,2000,6000,6,"S355JOWP","Class 1", "No","Type 3.1  Qvadrupla Cert","","Yes","No","Yes","No","","","","","","",11.4,527,480);
        productData.addHP(90,2000,6000,8,"S355JOWP","No", "No","","","Yes","No","Yes","No","","","","","","",11.4,527,476);
        productData.addHP(90,2000,6000,3,"S355J2WP+N","Class 1", "No","","","Yes","No","Yes","No","Class C","","","","","",11.4,527,492);
        productData.addHP(100,2000,6000,2,"S355J2WP+N","No", "No","","","Yes","No","Yes","No","","","","","","",11.4,527,476);
        productData.addHP(110,2000,6000,6,"S355J2WP+N","Class 3", "No","","","Yes","No","Yes","No","","","","","","",11.4,527,476);
        productData.addHP(130,2000,6000,2,"S355J2WP+N","No", "No","","","Yes","No","Yes","No","Class C","","","","","",11.4,527,492);
        productData.addHP(35,2000,12000,3,"S355J2WP+N","Class 1", "No","","","Yes","No","Yes","No","","","","","","",11.4,527,476);
        productData.addHP(120,2000,6000,3,"S235JOC+N","Class 3", "No","","","Yes","No","Yes","No","","","","","","",11.4,527,474);


        heavyPlatesItems = productData.getHeavyPlatesObsList();

        item.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(tableView.getItems().indexOf(cellData.getValue()) + 1));
        prd.setCellValueFactory(cellData -> new ReadOnlyStringWrapper("HP"));
        thickness.setCellValueFactory(new PropertyValueFactory<>("thickness"));
        width.setCellValueFactory(new PropertyValueFactory<>("width"));
        length.setCellValueFactory(new PropertyValueFactory<>("length"));
        qty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        weightPerSheet.setCellValueFactory(new PropertyValueFactory<>("weightPerSheet"));
        pieces.setCellValueFactory(new PropertyValueFactory<>("pieces"));
        quality.setCellValueFactory(new PropertyValueFactory<>("quality"));
        galvanising.setCellValueFactory(new PropertyValueFactory<>("galvanising"));
        usTest.setCellValueFactory(new PropertyValueFactory<>("usTest"));
        certificates.setCellValueFactory(new PropertyValueFactory<>("certificates"));
        zTest.setCellValueFactory(new PropertyValueFactory<>("zTest"));
        normalizing.setCellValueFactory(new PropertyValueFactory<>("normalizing"));
        tuv.setCellValueFactory(new PropertyValueFactory<>("tuv"));
        dbs.setCellValueFactory(new PropertyValueFactory<>("dbs"));
        sep.setCellValueFactory(new PropertyValueFactory<>("sep"));
        thicknessTolerances.setCellValueFactory(new PropertyValueFactory<>("thicknessTolerances"));
        sulphur.setCellValueFactory(new PropertyValueFactory<>("sulphur"));
        carbon.setCellValueFactory(new PropertyValueFactory<>("carbon"));
        tensileTest.setCellValueFactory(new PropertyValueFactory<>("tensileTest"));
        charpyTest.setCellValueFactory(new PropertyValueFactory<>("charpyTest"));
        cev.setCellValueFactory(new PropertyValueFactory<>("cev"));
        exwPivot.setCellValueFactory(new PropertyValueFactory<>("exwPivot"));
        freightCost.setCellValueFactory(new PropertyValueFactory<>("freightCost"));
        pivotItemPrice.setCellValueFactory(new PropertyValueFactory<>("pivotItemPrice"));
        thicknessAndWidthExtra.setCellValueFactory(new PropertyValueFactory<>("thicknessAndWidthExtra"));
        lengthExtra.setCellValueFactory(new PropertyValueFactory<>("lengthExtra"));
        qualityExtra.setCellValueFactory(new PropertyValueFactory<>("qualityExtra"));
        galvanisingExtra.setCellValueFactory(new PropertyValueFactory<>("galvanisingExtra"));
        usTestExtra.setCellValueFactory(new PropertyValueFactory<>("usTestExtra"));
        certificatesExtra.setCellValueFactory(new PropertyValueFactory<>("certificatesExtra"));
        zTestExtra.setCellValueFactory(new PropertyValueFactory<>("zTestExtra"));
        normalizingExtra.setCellValueFactory(new PropertyValueFactory<>("normalizingExtra"));
        tuvExtra.setCellValueFactory(new PropertyValueFactory<>("tuvExtra"));
        dbsExtra.setCellValueFactory(new PropertyValueFactory<>("dbsExtra"));
        sepExtra.setCellValueFactory(new PropertyValueFactory<>("sepExtra"));
        thicknessTolerancesExtra.setCellValueFactory(new PropertyValueFactory<>("thicknessTolerancesExtra"));
        sulphurExtra.setCellValueFactory(new PropertyValueFactory<>("sulphurExtra"));
        carbonExtra.setCellValueFactory(new PropertyValueFactory<>("carbonExtra"));
        tensileTestExtra.setCellValueFactory(new PropertyValueFactory<>("tensileTestExtra"));
        charpyTestExtra.setCellValueFactory(new PropertyValueFactory<>("charpyTestExtra"));
        cevExtra.setCellValueFactory(new PropertyValueFactory<>("cevExtra"));
        plateUnitWeightExtra.setCellValueFactory(new PropertyValueFactory<>("plateUnitWeightExtra"));
        effectiveFCAPrice.setCellValueFactory(new PropertyValueFactory<>("effectiveFCAPrice"));
        effectiveDAPPrice.setCellValueFactory(new PropertyValueFactory<>("effectiveDAPPrice"));
        value.setCellValueFactory(new PropertyValueFactory<>("value"));
        variableCost.setCellValueFactory(new PropertyValueFactory<>("variableCost"));
        contribution.setCellValueFactory(new PropertyValueFactory<>("contribution"));

        tableView.setItems(heavyPlatesItems);
        totalsForFooter();

    }

    public void handleAddItemButton() {

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainWindow.getScene().getWindow());
        dialog.setTitle("Add New Items");
        dialog.setHeaderText("Use this windows to insert new Items");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("addW.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            AddWController controller = fxmlLoader.getController();
            HeavyPlate heavyPlate = controller.itemsProcessed();
            productData.addHP(heavyPlate);
            tableView.refresh();
        }
    }

    public void handleEditItemButton() {

        HeavyPlate selectedHeavyPlate = tableView.getSelectionModel().getSelectedItem();
        if (selectedHeavyPlate != null) {
            showEditItemMenu(selectedHeavyPlate);
        }

    }

    public void showEditItemMenu(HeavyPlate item) {

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainWindow.getScene().getWindow());
        dialog.setTitle("Edit Item");
        dialog.setHeaderText("Edit item specifications");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("addW.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
            AddWController controller = fxmlLoader.getController();
            controller.populateFields(item);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            AddWController controller = fxmlLoader.getController();
            controller.updateItem(item);
            tableView.refresh();
            totalsForFooter();
        }

    }

    public void handleDeleteButton() {

        HeavyPlate selectedHP = tableView.getSelectionModel().getSelectedItem();
        if (selectedHP != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Delete Item");
            alert.setHeaderText("Delete Item: " + tableView.getSelectionModel().getSelectedItem());
            alert.setContentText("Press OK to confirm, Cancel to return");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                productData.deleteItem(selectedHP);
                tableView.getItems().remove(selectedHP);
                totalsForFooter();
            }
        }
    }

    public void totalsForFooter() {

        double sumQty = 0;
        double sumValue = 0;
        for (var item : heavyPlatesItems) {
            sumQty += item.getQty();
            sumValue += item.getValue();
        }
        sumQty = (double) Math.round(sumQty * 100) / 100;
        sumValue = (double) Math.round(sumValue * 100) / 100;
        totalQty.setText(String.valueOf(sumQty));
        totalValue.setText(String.valueOf(sumValue));
    }

    public void handleSetUpCustomerButton() {

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainWindow.getScene().getWindow());
        dialog.setTitle("Add Customer Details");
        dialog.setHeaderText("Use this windows to insert Customer Details");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("customerW.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            CustomerController controller = fxmlLoader.getController();
            Customer customer = controller.customerProcessed();
            nameLabel.setText(customer.getName());
            cCodeLabel.setText(customer.getCode());
            paymentTermLabel.setText(customer.getPaymentTerm());
            guaranteeLabel.setText(customer.getGuarantee());
            currencyLabel.setText(customer.getCurrency());
            deliveryCondLabel.setText(customer.getDeliveryCond());
            transportModeLabel.setText(customer.getTransportMode());
            segmentLabel.setText(customer.getSegment());
            shipmentLabel.setText(customer.getShipment());
        }

    }

    public void appAbout() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setHeaderText(null);
        alert.setContentText("""
                Coder: Viorel Busuioc
                
                contact: busuiocviorel.ro@gmail.com""");

        alert.showAndWait();
    }

}