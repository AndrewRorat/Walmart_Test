package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;

public class TestRegistrationPage extends BaseTest {

    private final String FIRST_NAME = "Andrew";
    private final String LAST_NAME = "Rorat";
    private final String EMAIL_ADDRESS = "rorat6937@gmail.com";
    private final String PASSWORD = "1234567";

    @Test(description = "Verify that registration form is working")
    public void testRegistration() {
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        loginPage.clickOnCreateNewAccountButton();
        registerPage.enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterEmailAddress(EMAIL_ADDRESS)
                .enterPassword(PASSWORD)
                .clickCreateButton();

        Assert.assertTrue(registerPage.isHomePageButtonDisplayed());
    }
}