package CRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_1 {
    WebDriver driver ;
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }
    @Test
    public void Verifytitle() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("SuiteCRM", title);
        System.out.println("Page title is matching ");
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}