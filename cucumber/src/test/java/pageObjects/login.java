package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {

    @FindBy(id ="user-name")
    public static WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement password;

    @FindBy(xpath = "//input[@name='login-button']")
    public static WebElement loginBtn;
}
