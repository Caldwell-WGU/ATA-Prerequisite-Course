package com.ata;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    /**
     * Initializes a Person object.
     *
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param age the age of the person
     * */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // TODO: Step 1: Create the equals method
    public Boolean equals(Person otherPerson){
        if (this == otherPerson) return true;
        if (null == otherPerson) return false;
        if (getClass() != otherPerson.getClass()) return false;
        Person castObject = (Person) otherPerson;
        return firstName.equals(castObject.firstName) && lastName.equals(castObject.lastName);    
    }


    // TODO: Step 2: Create the hashCode method
    public int hashCode(){
        return Objects.hash(firstName, lastName);
    }

}
