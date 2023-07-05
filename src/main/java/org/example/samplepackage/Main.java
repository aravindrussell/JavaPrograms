package org.example.samplepackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[]){

        int[] numbers = {66,1,44,2,45,99,100};

        Arrays.sort(numbers);
        int secondLargest = 0;
        for (int i = numbers.length - 2; i>0; i--){
            if (numbers[i] != numbers[numbers.length - 1]){
                secondLargest = numbers[i];
                break;
            }
        }
        System.out.println(secondLargest);
    }

}
