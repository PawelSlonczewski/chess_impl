module com.pslonczewski.chad_chess_variant_impl {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.google.common;

    opens com.pslonczewski.chad_chess_variant_impl to javafx.fxml;
    exports com.pslonczewski.chad_chess_variant_impl;
    exports com.pslonczewski.chad_chess_variant_impl.engine.board;
    opens com.pslonczewski.chad_chess_variant_impl.engine.board to javafx.fxml;
    exports com.pslonczewski.chad_chess_variant_impl.engine.pieces;
    opens com.pslonczewski.chad_chess_variant_impl.engine.pieces to javafx.fxml;
    exports com.pslonczewski.chad_chess_variant_impl.engine;
    opens com.pslonczewski.chad_chess_variant_impl.engine to javafx.fxml;
}