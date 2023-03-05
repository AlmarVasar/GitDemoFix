module com.example.gitdemofix {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitdemofix to javafx.fxml;
    exports com.example.gitdemofix;
}