package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Page {

    public AdminPage(WebDriver driver){
        super(driver);
    }

    @FindBy (xpath="//input[@name='username']")
    private WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy (xpath = "//button[@name='login']")
    private WebElement loginButton;

    public HomePage login(String nameValue, String passwordValue) {
        username.sendKeys(nameValue);
        password.sendKeys(passwordValue);
        loginButton.click();
        return new HomePage(driver);
    }
}
