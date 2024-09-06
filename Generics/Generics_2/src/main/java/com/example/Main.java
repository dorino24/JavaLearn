package com.example;

import java.util.LinkedList;
import java.util.List;

class Data<T> {
    private T myVariable;

    public Data(T myVariable) {
        super();
        this.myVariable = myVariable;
    }

    public T getMyVariable() {
        return myVariable;
    }

    @Override
    public String toString() {
        return "Data [myVariable=" + myVariable + "]";
    }

}

public class Main {
    public static void main(String[] args) {
        List<Data<String>> elements = new LinkedList<>();
        elements.add(new Data<>("Some text"));
        elements.add(new Data<>("One"));
        elements.add(new Data<>("Two"));
        elements.add(new Data<>("Three"));
        elements.add(new Data<>("Four"));

        Main main = new Main();
        main.printList(elements);
    }

    void printList(List<Data<String>> list) {
        for (Data<String> stringData : list) {
            System.out.println("Element: " + stringData.getMyVariable());
        }
    }
}
