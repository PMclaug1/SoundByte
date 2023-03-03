module com.sound.soundbyte {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                requires net.synedra.validatorfx;
                requires org.kordamp.bootstrapfx.core;
            
    opens com.sound.soundbyte to javafx.fxml;
    exports com.sound.soundbyte;
}