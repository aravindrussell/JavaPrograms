package org.example.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main (String args[]) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement homeCheckBoxElement = driver.findElement(By.xpath(""));

    }
}
