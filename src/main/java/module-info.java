module com.example.fx {
    //FXML import
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.media;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.fx to javafx.fxml;
    exports com.example.fx;
}