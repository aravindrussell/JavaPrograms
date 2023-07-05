package org.example.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class MultipleWindowHandle {

    public static void main (String[] args) {
        WebDriver driver = new ChromeDriver();
        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

        assert driver.getWindowHandles().size() == 1;

        driver.findElement(By.linkText("new window")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }
}
