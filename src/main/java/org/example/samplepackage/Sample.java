package org.example.samplepackage;

public class Sample {

    public static void main(String args[]){

        String value = "15,000".replace(",","");
        System.out.println(value);
        Double aDouble = Double.parseDouble(value);
        System.out.println(aDouble);

    }
}
