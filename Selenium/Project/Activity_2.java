package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_2 {
    WebDriver driver ;
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }
    @Test
    public void getUrlHeader() {
        WebElement url=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[1]/div[1]/img"));
        String src = url.getAttribute("src");
        System.out.println(src);
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
