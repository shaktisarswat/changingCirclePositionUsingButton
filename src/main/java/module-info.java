module com.example.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.phoenix.changingCirclePostion to javafx.fxml;
    exports com.phoenix.changingCirclePostion;
}