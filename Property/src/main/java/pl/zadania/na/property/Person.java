package pl.zadania.na.property;

import java.time.LocalDate;

import javafx.beans.binding.When;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	
	private StringProperty name = new SimpleStringProperty();
	private BooleanProperty nameOK = new SimpleBooleanProperty(false); 
	
	private StringProperty surname = new SimpleStringProperty();
	private BooleanProperty surnameOK = new SimpleBooleanProperty(false);
	
	private IntegerProperty date = new SimpleIntegerProperty();
	private BooleanProperty dateCheckBox = new SimpleBooleanProperty(false);
	
	private StringProperty yourAge = new SimpleStringProperty();
	
	private BooleanProperty next = new SimpleBooleanProperty(false);
	
	private IntegerProperty acctualldate = new SimpleIntegerProperty(LocalDate.now().getYear());
	
	public Person() {
		nameOK.bind(name.isNotEmpty());
		surnameOK.bind(surname.isNotEmpty());
		next.bind(dateCheckBox.not());
		yourAge.bind(new When(date.isNotEqualTo(0))
				.then(acctualldate.subtract(date).asString()).otherwise(""));
		
	}

	public StringProperty getName() {
		return name;
	}

	public void setName(StringProperty name) {
		this.name = name;
	}

	public BooleanProperty getNameOK() {
		return nameOK;
	}

	public void setNameOK(BooleanProperty nameOK) {
		this.nameOK = nameOK;
	}

	public StringProperty getSurname() {
		return surname;
	}

	public void setSurname(StringProperty surname) {
		this.surname = surname;
	}

	public BooleanProperty getSurnameOK() {
		return surnameOK;
	}

	public void setSurnameOK(BooleanProperty surnameOK) {
		this.surnameOK = surnameOK;
	}

	public IntegerProperty getDate() {
		return date;
	}

	public void setDate(IntegerProperty date) {
		this.date = date;
	}

	public BooleanProperty getDateCheckBox() {
		return dateCheckBox;
	}

	public void setDateCheckBox(BooleanProperty dateCheckBox) {
		this.dateCheckBox = dateCheckBox;
	}

	public StringProperty getYourAge() {
		return yourAge;
	}

	public void setYourAge(StringProperty yourAge) {
		this.yourAge = yourAge;
	}

	public BooleanProperty getNext() {
		return next;
	}

	public void setNext(BooleanProperty next) {
		this.next = next;
	}

}
