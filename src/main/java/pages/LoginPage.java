package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    private ChromeDriver driver;

    @FindBy(xpath = "//*[@id = 'email']")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@data-automation-id= 'signin-submit-btn'][contains(text(), 'Sign In')]")
    private WebElement signInButton;

    @FindBy(xpath = "//button[contains(@data-automation-id, 'signin-sign-up-btn')]")
    private WebElement createAccountButton;

    @FindBy(xpath = "//*[@id = 'vh-home-link' ]")
    private WebElement homePageButton;

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage insertEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage insertPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickOnSignInButton() {
        signInButton.click();
        return this;
    }

    public RegisterPage clickOnCreateNewAccountButton() {
        createAccountButton.click();
        return new RegisterPage(driver);
    }

    public boolean isHomePageButtonDisplayed() {
        return homePageButton.isDisplayed();
    }
}