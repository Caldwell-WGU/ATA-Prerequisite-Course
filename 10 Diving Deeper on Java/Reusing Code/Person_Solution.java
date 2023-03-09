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
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        Person otherPerson = (Person) other;
        return firstName.equals(otherPerson.firstName) && lastName.equals(otherPerson.lastName);
    }

    // TODO: Step 2: Create the hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
