package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By inputEmailOrPhone = By.id("email-phone");
    private By buttonNext = By.id("email-phone-submit");
    private By inputPassword = By.id("password-input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(inputEmailOrPhone).sendKeys(email);
    }

    public void clickNextButton(){
        driver.findElement(buttonNext).click();
    }

    public void setPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

}
