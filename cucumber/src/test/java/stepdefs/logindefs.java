package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.login;

import java.util.List;
import java.util.Map;

public class logindefs {
    static WebDriver driver;
    @Given("user launches website")
    public void user_launches_website() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
//    @Given("user launches website {string}")
//    public void user_launches_website(String url) {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get(url);
//    }
    @Given("user valid username {string}")
    public void user_valid_username(String userName) {
        WebElement ele = driver.findElement(By.id("user-name"));
        ele.sendKeys(userName);
    }
    @And("user enter valid password {string}")
    public void user_enter_valid_password(String password) {
        WebElement ele = driver.findElement(By.xpath("//input[@id='password']"));
        ele.sendKeys(password);
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement ele = driver.findElement(By.xpath("//input[@name='login-button']"));
        ele.click();
    }
    @Then("user redirects to the My account page")
    public void user_redirects_to_the_my_account_page() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }
    @And("user enter the following details")
    public void user_enter_the_following_details(DataTable dataTable) {
       List<List<String>> userData = dataTable.asLists(String.class);
       for(List<String>data: userData){
             System.out.println(data);
       }
    }
  //for filling a form we can use data table concept. need to check
    @And("user enter the following details with columns")
    public void userEnterTheFollowingDetailsWithColumns(DataTable dataTable) {
       List<Map<String,String>>user= dataTable.asMaps(String.class, String.class);
        System.out.println(user);
        System.out.println(user.get(0).get("username"));//from the zeroth row get the value for the username key
        for(Map<String, String>e:user){
            System.out.println(e.get("username"));
            System.out.println(e.get("password"));
        }
    }
}
