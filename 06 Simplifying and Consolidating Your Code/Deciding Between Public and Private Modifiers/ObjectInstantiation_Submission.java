package com.ata;

public class ObjectInstantiation {

    // TODO: Step 2.1: Declare a private Form object below called myForm.
    private Form myForm;


    // TODO: Step 1: Create method createEmptyForm below
    public Form createEmptyForm(){
        Form newForm = new Form();
        return newForm;
    }


    // TODO: Step 2.2: Create method instantiateMyForm below
    public void instantiateMyForm(){
        myForm = new Form();
    }


    // TODO: Step 3.1: Create method createTempObj below
    public Temperature createTempObj (){
        Temperature myTemp = new Temperature(32);
        return myTemp;
    }


    // TODO: Step 3.2: Create method createTempObj2 below
    public Temperature createTempObj2 (){
        Temperature myTemp = new Temperature(0, true);
        return myTemp;
    }

    
}
