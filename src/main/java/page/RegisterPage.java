package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;
    private By inputPhoneOrNumber = By.id("regis-input");
    private By buttonDaftar = By.className("css-ijws95-unf-btn");
    private By buttonConfirm = By.className("css-lwa81l-unf-btn");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setInputPhoneOrNumber(String userInput){
        driver.findElement(inputPhoneOrNumber).sendKeys(userInput);
    }

    public void clickButtonDaftar(){
        driver.findElement(buttonDaftar).click();
    }

    public LoginPage setLoginPage(){
        return new LoginPage(driver);
    }

    public void clickConfirmButton(){
        driver.findElement(buttonConfirm).click();
    }
}
