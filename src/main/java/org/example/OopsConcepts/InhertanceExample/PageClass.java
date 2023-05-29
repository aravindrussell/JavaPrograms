package org.example.OopsConcepts.InhertanceExample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageClass {

    private String BROWSER = "CHROME";

    protected WebDriver driver;

    @Before
    public void inilizeDriver(){
        switch (BROWSER){
            case "CHROME":
                driver = new ChromeDriver();
                System.out.println("Launching Chrome Driver");
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                System.out.println("Launching Firefox Driver");
                break;
            case "EDGE":
                driver = new EdgeDriver();
                System.out.println("Launching Edge Driver");
                break;
            default:
                System.out.println("No Driver is available for the value : " + BROWSER);
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
