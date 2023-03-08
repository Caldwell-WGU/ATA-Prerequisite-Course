package com.ata;

public class ObjectInstantiation {

    // TODO: Step 2.1: Declare a private Form object below called myForm.
    private Form myForm;

    // TODO: Step 1: Create method createEmptyForm below
    public Form createEmptyForm() {
        Form myFormLocal = new Form();
        return myFormLocal;
    }

    // TODO: Step 2.2: Create method instantiateMyForm below
    public void instantiateMyForm() {
        myForm = new Form();

        // not needed for solution but will fail staticchecks if myForm is not used.
        System.out.println(myForm);
    }

    // TODO: Step 3.1: Create method createTempObj below
    public Temperature createTempObj() {
        Temperature temp = new Temperature(32);
        return temp;
    }

    // TODO: Step 3.2: Create method createTempObj2 below
    public Temperature createTempObj2() {
        Temperature temp = new Temperature(0, true);
        return temp;
    }
}
