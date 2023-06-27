package org.example.SeleniumProgram;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class SauceLabsFirstProgram {

    public static void main(String args[]) throws MalformedURLException {

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");

        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "aravindrussell");
        sauceOptions.put("accessKey", "daaadd65-b08f-47a7-9393-4c845018458c");
        sauceOptions.put("build", "selenium-build-FirstTest");
        sauceOptions.put("name", "First Test");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().timeouts().getPageLoadTimeout();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        WebElement productTitle = driver.findElement(By.cssSelector("span[class='title']"));
        System.out.println(productTitle.getText());

        Assert.assertEquals(productTitle.getText(),"Products","Product Page was not diaplayed");

        driver.quit();
    }

}
