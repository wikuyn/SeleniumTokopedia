package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTests extends BaseTests {

    private LoginPage loginPage;

    @Test
    public void testInvalidLogin(){
        loginPage = homePage.clickLoginButton();
        loginPage.setEmail("wikundaru3@gmail.com");
        loginPage.clickNextButton();
        loginPage.setPassword("lupapakepassword");
    }

}
