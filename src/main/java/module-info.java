module com.example.combatgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.combatgame to javafx.fxml;
    exports com.example.combatgame;
}