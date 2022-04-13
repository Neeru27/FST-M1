package CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_4 {
    WebDriver driver ;
    WebDriverWait wait;



    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void login() {
        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("admin");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"username_password\"]")).sendKeys("pa$$w0rd");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        boolean home=driver.findElement(By.id("toolbar")).isDisplayed();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
