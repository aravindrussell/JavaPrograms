package org.example.OopsConcepts.InhertanceExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class TestClass extends PageClass{

    @Test
    public void SearchInGoogle(){
        driver.navigate().to("https://www.google.com/");
        WebElement googleTextArea = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        googleTextArea.sendKeys("Selenium Webdriver");
        googleTextArea.sendKeys(Keys.ENTER);

        driver.findElement(By.partialLinkText("WebDriver")).click();
        WebElement value = driver.findElement(By.xpath("//div[@class='td-content']/h1"));
        Assert.assertEquals(value.getText(),"WebDriver");
    }

}
