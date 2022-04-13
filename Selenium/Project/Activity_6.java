package CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_6 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("admin");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"username_password\"]")).sendKeys("pa$$w0rd");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
    }

    @Test
    public void getColor() {

        String ActualResult = driver.findElement(By.id("grouptab_3")).getText();
        String ExpecRe = "ACTIVITIES";
        Assert.assertEquals(ActualResult, ExpecRe);
        System.out.println("ACTIVITIES menu is verified");

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}