package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {
   public static void main(String[] args)
   {
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.example.com");
       driver.close();
   }
}
