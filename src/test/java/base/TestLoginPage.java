package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLoginPage extends BaseTest {

    private final String EMAIL_ADDRESS = "rorat6937@gmail.com";
    private final String PASSWORD = "1234567";


    @Test(description = "Verify that registration form is working")
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.insertEmail(EMAIL_ADDRESS)
                .insertPassword(PASSWORD)
                .clickOnSignInButton();


        Assert.assertTrue(loginPage.isHomePageButtonDisplayed(),
                String.format("Email or password are not correct"));
    }
}