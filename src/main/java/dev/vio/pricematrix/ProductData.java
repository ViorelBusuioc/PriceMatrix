package dev.vio.pricematrix;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductData {

    private ObservableList<HeavyPlate> heavyPlatesObsList = FXCollections.observableArrayList();

    public ProductData() {
    }

    public ObservableList<HeavyPlate> getHeavyPlatesObsList() {
        return heavyPlatesObsList;
    }

    public void addHP(int thickness, int width, int length, int pieces, String quality, String galvanising, String usTest, String certificates, String zTest, String normalizing, String tuv, String dbs, String sep, String thicknessTolerances, String sulphur, String carbon, String tensileTest, String charpyTest, String cev, double freightCost, double pivotItemPrice, double variableCost) {

        heavyPlatesObsList.add(new HeavyPlate(thickness,width,length,pieces,quality,galvanising,usTest,certificates,zTest,normalizing,tuv,dbs,sep,thicknessTolerances,sulphur,carbon,tensileTest,charpyTest,cev,freightCost,pivotItemPrice,variableCost));
    }

    public void addHP(HeavyPlate heavyPlate) {
        heavyPlatesObsList.add(heavyPlate);
    }

    public void deleteItem(HeavyPlate item) {

        heavyPlatesObsList.remove(item);
    }



}
