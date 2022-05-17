module Arista {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens arista.view to javafx.graphics, javafx.fxml;
	opens arista to javafx.graphics;
}
