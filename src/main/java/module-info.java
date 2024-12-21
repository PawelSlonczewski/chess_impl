module com.pslonczewski.chad_chess_variant_impl {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.pslonczewski.chad_chess_variant_impl to javafx.fxml;
    exports com.pslonczewski.chad_chess_variant_impl;
}