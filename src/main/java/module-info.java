module com.example.helloworldjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldjfx to javafx.fxml;
    exports com.example.helloworldjfx;
}