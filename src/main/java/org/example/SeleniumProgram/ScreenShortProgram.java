package org.example.SeleniumProgram;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Random;

public class ScreenShortProgram {

    public static void main(String args[]) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        Random random = new Random();
        int randomNumber = random.nextInt(99999);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceScreenShot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destinationPath = System.getProperty("user.dir")
                + "/src/main/java/org/example/SeleniumProgram/ScreenShot"+ randomNumber +".png";
        File desScreenShot = new File(destinationPath);
        FileHandler.copy(sourceScreenShot,desScreenShot);
        driver.quit();
    }
}
