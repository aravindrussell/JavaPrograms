package org.example.OopsConcepts.Encapsulation;

public class ChildClass {

    public static void main (String[] args){

        ParentClass parentClass = new ParentClass();

        System.out.println(parentClass.getValue());
        parentClass.setValue("Aravind Russell V");
        System.out.println(parentClass.getValue());

    }

}
