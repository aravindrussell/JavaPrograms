package org.example.OopsConcepts.PolymorphismExample;

public class CalcMainClass extends OverRideMethod{

    @Override
    public void display(){
        System.out.println("Two");
    }

    public static void main(String[] args){

        CalculationClass calculationClass = new CalculationClass();

        System.out.println(calculationClass.add("asdfg", "asdfgh"));
        System.out.println(calculationClass.add("1", "4"));
        System.out.println(calculationClass.add(12, 10));
        System.out.println(calculationClass.add(12.1234, 13.1234));

        CalcMainClass calcMainClass = new CalcMainClass();
        calcMainClass.display();

        OverRideMethod overRideMethod = new OverRideMethod();
        overRideMethod.display();

    }
}
