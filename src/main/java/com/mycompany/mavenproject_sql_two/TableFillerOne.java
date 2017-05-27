package com.mycompany.mavenproject_sql_two;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TableFillerOne {

    private SimpleStringProperty firstName;

    TableFillerOne(String fName) {
        firstName = new SimpleStringProperty(fName);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        firstName.set(fName);
    }

//    public StringProperty firstNameProperty() {
//        return firstName;
//    }

}
