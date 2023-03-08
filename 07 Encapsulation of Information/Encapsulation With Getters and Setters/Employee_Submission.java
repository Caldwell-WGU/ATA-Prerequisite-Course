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
    public void setName (String name){
        this.name = name;
    }
    
    public void setNumberOfCompanyShares (int numberOfCompanyShares){
        this.numberOfCompanyShares = numberOfCompanyShares;
    }


    // TODO: Step 4 add getter methods for the attributes.
    public String getName(){
        return name;
    }
    
    public int getNumberOfCompanyShares(){
        return numberOfCompanyShares;
    }

    // TODO: TODO: Step 5 add and implement the addShares method.
    public int addShares (int numberOfShares){
        return numberOfCompanyShares += numberOfShares;
    }

}
