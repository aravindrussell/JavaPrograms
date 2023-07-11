package org.example.SeleniumProgram;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TextBox {

    public static void main (String args[]){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("AravindRussell");

        WebElement email = driver.findElement(By.cssSelector("input[id='userEmail']"));
        email.sendKeys("aravind.russell@outlook.com");

        WebElement currentAddress = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
        currentAddress.sendKeys("44, Main Road \n Podanur \n Podanur Main Road \n Coimbatore \n 641023");

        WebElement permanentAddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        permanentAddress.sendKeys("44, Main Road \n Podanur \n Podanur Main Road \n Coimbatore \n 641023");

//        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submit']"));
        Actions action = new Actions(driver);
        WebElement submitButton = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='submit']")));
        action.moveToElement(submitButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();
        System.out.println("Submit button clicked");

        List<WebElement> outPutList = driver.findElements(By.xpath("//div[@id='output']//p"));
        int listSize = outPutList.size();

        for (WebElement output : outPutList){
            System.out.println("Verifying output");
            String out = output.getText();
            System.out.println(out);
            System.out.println(!out.isEmpty());
            Assert.isTrue(!out.isEmpty(),"Out put is empty");
        }

        driver.quit();
    }
}
