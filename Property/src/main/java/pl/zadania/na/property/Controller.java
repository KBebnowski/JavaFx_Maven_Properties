package pl.zadania.na.property;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class Controller {
	
	@FXML
	private TextField nameTextField;
	
	@FXML
	private Label nameOkLabel;
	
	@FXML
	private TextField surnameTextField;
	
	@FXML
	private Label surnameOkLabel;
	
	@FXML
	private TextField dateTextField;
	
	@FXML
	private CheckBox dateCheckBox;
	
	@FXML
	private Label yourAgeLabel;
	
	@FXML
	private Button nextButton;
	

	Person person = new Person();
	
	public void initialize(){
		nameTextField.textProperty().bindBidirectional(person.getName());
		surnameTextField.textProperty().bindBidirectional(person.getSurname());
		
		nameOkLabel.visibleProperty().bind(person.getNameOK());
		surnameOkLabel.visibleProperty().bind(person.getSurnameOK());
		
		StringConverter  converter = new NumberStringConverter();
		dateTextField.textProperty().bindBidirectional(person.getDate(), converter);
		
		dateCheckBox.selectedProperty().bindBidirectional(person.getDateCheckBox());
		
		yourAgeLabel.textProperty().bind(person.getYourAge());		
		
		nextButton.disableProperty().bind(person.getNext());
	}
}
