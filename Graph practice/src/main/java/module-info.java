module com.example.graph_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.graph_practice to javafx.fxml;
    exports com.example.graph_practice;
}