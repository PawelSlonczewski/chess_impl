module com.pslonczewski.chad_chess_variant_impl {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.google.common;

    opens com.pslonczewski.chad_chess_variant_impl to javafx.fxml;
    exports com.pslonczewski.chad_chess_variant_impl;
    exports com.pslonczewski.chad_chess_variant_impl.board;
    opens com.pslonczewski.chad_chess_variant_impl.board to javafx.fxml;
    exports com.pslonczewski.chad_chess_variant_impl.pieces;
    opens com.pslonczewski.chad_chess_variant_impl.pieces to javafx.fxml;
}