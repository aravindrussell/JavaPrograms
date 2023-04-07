package org.example.SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.javatpoint.com/");

        driver.manage().window().maximize();

    }
}
