package org.example.OopsConcepts.InterfaceExample;

public class ImpClass implements PrintClass{
    @Override
    public void print() {
        System.out.println("Implements interface to the class");
    }

    @Override
    public int number(int a, int b) {
        return a+b;
    }

    public static void main(String args[]){
        PrintClass printClass = new ImpClass();
        System.out.println(printClass.number(1000,234567));
        printClass.print();

        ImpClass impClass = new ImpClass();
        System.out.println(impClass.number(12,13));
        impClass.print();
    }
}
