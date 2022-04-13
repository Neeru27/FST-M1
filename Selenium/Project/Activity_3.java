package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_3 {
    WebDriver driver ;
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void getcopyrightText() {
        WebElement copytext=driver.findElement(By.id("admin_options"));
        String text=copytext.getText();
        System.out.println("first copyright text is: "+text);

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}