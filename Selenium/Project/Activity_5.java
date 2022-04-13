package CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_5 {
    WebDriver driver ;
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
        WebElement toolbar=driver.findElement(By.id("toolbar"));
        String colour=toolbar.getCssValue("color");
        System.out.println("The color of toolbar is: "+colour);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
