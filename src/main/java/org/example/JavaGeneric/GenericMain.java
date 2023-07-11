package org.example.JavaGeneric;

import java.util.LinkedList;
import java.util.List;

public class GenericMain {

    public static void main (String args[]){

        ClassTest<Integer> integerClassTest = new ClassTest<>(200);
        System.out.println(integerClassTest.getObject());

        ClassTest<String> stringClassTest = new ClassTest<>("Aravind Russell V");
        System.out.println(stringClassTest.getObject());

        List<String> newList = new LinkedList<>();
        newList.add("Aravind");
        newList.add("Russell");
        newList.add("Ayvanth");
        newList.add("Ashmita");

        ClassTest<List<String>> listClassTest = new ClassTest<>(newList);
        System.out.println(listClassTest.getObject());

    }

}
