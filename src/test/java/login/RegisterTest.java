package login;

import base.BaseTests;
import org.testng.annotations.Test;
import page.LoginPage;
import page.RegisterPage;

public class RegisterTest extends BaseTests {
    private RegisterPage registerPage;

    @Test
    public void inputUsernameOrPhone(){
        registerPage = homePage.clickRegisterButton();
        registerPage.setInputPhoneOrNumber("ucokbeler81@gmail.com");
        registerPage.clickButtonDaftar();
        registerPage.clickConfirmButton();
        registerPage.setLoginPage().setPassword("Jakarta161199");
    }

}
