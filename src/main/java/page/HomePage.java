package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By loginButton = By.cssSelector("button[class='css-2hev56']");
    private By registerButton = By.cssSelector("button[class='css-t0ond8']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new RegisterPage(driver);
    }

    public LoginPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

}
