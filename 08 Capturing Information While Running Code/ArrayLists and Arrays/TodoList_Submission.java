package com.ata;
import java.util.ArrayList;
import java.util.Arrays;

public class TodoList {

    // TODO: Declare attributes below
    private ArrayList<String> todoList;
    private TodoListHelper todoListHelper;

    // TODO: Create constructor below
    public TodoList(String value){
        todoListHelper = new TodoListHelper();
        todoList =  new ArrayList<String>(Arrays.asList(value));
    }

    // TODO: Create addItem method below
    public ArrayList<String> addItem (String value) {
        todoList.add(value);
        return todoList;
    }


    // TODO: create getNumberOfItems below
    public int getNumberOfItems(){
        return todoList.size();
    }

    // TODO: create printTodo below
    public void printTodo () {
        for (String i : todoList) {
            todoListHelper.printSpecial(i);
        } 
    }

    // TODO: create removeItem below
    public ArrayList<String> removeItem (int value) {
        todoList.remove(value);
        return todoList;
    }

    // TODO: Create changeItem below
    public ArrayList<String> changeItem (int index, String value) {
        todoList.set(index, value);
        return todoList;
    }
}
