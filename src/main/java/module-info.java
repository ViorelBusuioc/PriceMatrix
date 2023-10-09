module dev.vio.pricematrix {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens dev.vio.pricematrix to javafx.fxml;
    exports dev.vio.pricematrix;
}