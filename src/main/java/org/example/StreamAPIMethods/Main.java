package org.example.StreamAPIMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String args[]) {
        String number = "7893412345";
        List<Integer> intValues = new LinkedList<>();

        for (int i=0;i< number.length();i++){
            String temp = number.charAt(i) + "";
            intValues.add(Integer.parseInt(temp.trim()));
        }

        System.out.println("Sum value of list of numbers : " + intValues.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Average value of list of numbers : " + intValues.stream().mapToInt(Integer::intValue).average());
        System.out.println("Count of list : " + intValues.stream().mapToInt(Integer::intValue).count());
        System.out.println("Sourt a list : " + intValues.stream().sorted().collect(Collectors.toList()));
    }
}
