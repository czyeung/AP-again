module the.best.group5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires googleauth;
    requires com.google.zxing;
    requires com.google.zxing.javase;
    requires java.desktop;


    opens the.best.group5 to javafx.fxml;
    exports the.best.group5;
}