package org.example.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

    public static void main (String[] args) {
        WebDriver driver = new ChromeDriver();
        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

        assert driver.getWindowHandles().size() == 1;

        driver.findElement(By.linkText("new window")).click();

        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
