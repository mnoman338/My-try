module nm.noman {
    requires javafx.controls;
    requires javafx.fxml;


    opens nm.noman to javafx.fxml;
    exports nm.noman;
}