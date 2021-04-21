module org.dcsmf.testfx {
    requires com.jfoenix;
    requires javafx.controls;
    requires javafx.fxml;
    exports org.dcsmf.testfx.main;
    opens org.dcsmf.testfx.conroller to javafx.fxml;
}