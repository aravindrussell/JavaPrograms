package org.example.SeleniumProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHandle {

    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(2));

        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        driver.manage().window().maximize();

        WebElement alertLink = driver.findElement(By.linkText("See an example alert"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(alertLink));
        alertLink.click();

        Thread.sleep(2000);
        Alert alert = webDriverWait.until(ExpectedConditions.alertIsPresent());

        alert.accept();

        driver.quit();

    }

}
;