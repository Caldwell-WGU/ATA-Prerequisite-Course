package com.ata;

public class Employee {

    // TODO: Step 1 make these attributes private.
    private String name;
    private int numberOfCompanyShares;

    public Employee(String name, int numberOfCompanyShares) {
        // TODO: Step 2 set the attributes to the values of the arguments using "this".
        this.name = name;
        this.numberOfCompanyShares = numberOfCompanyShares;
    }

    // TODO: Step 3 add setter methods for the attributes.
    /*
    * sets the name attribute
    *
    * @param name the name
    * */
    public void setName(String name) {
        this.name = name;
    }

    /*
    * sets the numberOfCompanyShares attribute
    *
    * @param numberOfCompanyShares
    * */
    public void setNumberOfCompanyShares(int numberOfCompanyShares) {
        this.numberOfCompanyShares = numberOfCompanyShares;
    }

    // TODO: Step 4 add getter methods for the attributes.
    /*
    * gets the name
    *
    * @return String
    * */
    public String getName() {
        return name;
    }

    /*
    * gets the numberOfCompanyShares
    *
    * @return int
    * */
    public int getNumberOfCompanyShares() {
        return numberOfCompanyShares;
    }

    // TODO: Step 5 add and implement the addShares method.
    /*
    * Adds the number of shares to the existing number of shares
    *
    * @param numberOfShares the number of shares to add
    * @return int the current number of shares
    * */
    public int addShares(int numberOfShares) {
        numberOfCompanyShares += numberOfShares;
        return numberOfCompanyShares;
    }
}
