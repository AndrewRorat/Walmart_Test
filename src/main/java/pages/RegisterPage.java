package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private ChromeDriver driver;

    @FindBy(xpath = "//*[@id='first-name-su']")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id='last-name-su']")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id='email-su']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//*[contains(@data-tl-id, 'signup-password-input')]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@data-automation-id='signup-submit-btn']")
    private WebElement createButton;

    @FindBy(xpath = "//*[@id = 'vh-home-link' ]")
    private WebElement homePageButton;

    public RegisterPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RegisterPage enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public RegisterPage enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    public RegisterPage enterEmailAddress(String email) {
        emailAddressField.sendKeys(email);
        return this;
    }

    public RegisterPage enterPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public RegisterPage clickCreateButton() {
        createButton.click();
        return this;
    }

    public boolean isHomePageButtonDisplayed() {
        return homePageButton.isDisplayed();
    }
}