package com.example;

import java.util.ArrayList;
import java.util.List;

class Data {
    public <E> void printListData(List<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }

    public <E> void printArrayData(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
};

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Create an instance of the Data class
        Data data = new Data();

        // Print the contents of the integer list
        System.out.println("Printing integer list");
        System.out.println("******************");
        data.printListData(list);

        // Create a list of strings
        List<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Four");

        // Print the contents of the string list
        System.out.println("Printing String list");
        System.out.println("******************");
        data.printListData(list2);

        // Create an array of strings
        String[] stringArray = {"One", "two", "Three"};

        // Create an array of integers
        Integer[] integerArray = {1, 2, 3, 4};

        // Print the contents of the string array
        System.out.println("Printing String array");
        System.out.println("******************");
        data.printArrayData(stringArray);

        // Print the contents of the integer array
        System.out.println("Printing integer array");
        System.out.println("******************");
        data.printArrayData(integerArray);

        // Create an array of doubles
        Double[] doubleArray = {2.0, 5.0, 4.6, 8.5};

        // Print the contents of the double array
        System.out.println("Printing double array");
        System.out.println("******************");
        data.printArrayData(doubleArray);
    }
}
