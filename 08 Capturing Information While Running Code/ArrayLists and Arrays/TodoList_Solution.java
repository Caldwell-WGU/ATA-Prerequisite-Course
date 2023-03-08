package com.ata;

import java.util.ArrayList;
import java.util.Arrays;

public class TodoList {

    // TODO: Declare attributes below
    private ArrayList<String> todoList;
    private TodoListHelper todoListHelper;

    //TODO: Create constructor below
    public TodoList(String firstItem) {
        todoList = new ArrayList<>(Arrays.asList(firstItem));
        todoListHelper = new TodoListHelper();
    }

    // TODO: Create addItem method below
    public ArrayList<String> addItem(String item) {
        todoList.add(item);
        return todoList;
    }

    // TODO: create getNumberOfItems below
    public int getNumberOfItems() {
        return todoList.size();
    }

    // TODO: create printTodo below
    public void printTodo() {
        for (String item: todoList) {
            todoListHelper.printSpecial(item);
        }
    }

    // TODO: create removeItem below
    public ArrayList<String> removeItem(int index) {
        todoList.remove(index);
        return todoList;
    }

    // TODO: Create changeItem below
    public ArrayList<String> changeItem(int index, String newValue) {
        todoList.set(index, newValue);
        return todoList;
    }
}
