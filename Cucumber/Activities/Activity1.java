package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @Given("^User is on Google Home Page$")
    public void userIsOnGoogleHomePage(){
        driver = new FirefoxDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://google.com");
    }
    @When("^User types in Cheese and hits ENTER$")
    public void userTypesInCheeseAndHitsEnter(){
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
    }
    @Then("^Show how many search results were shown$")
    public void ShowHowManySearchResultsWereShown(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
    System.out.println("The number of results found:"+driver.findElement(By.id("result-stats")).getText());
    }
    @And("^Close the browser$")
    public void closeTheBrowser(){
        driver.close();
    }
}
