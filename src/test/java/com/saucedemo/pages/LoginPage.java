package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By swagLabsLogo = By.cssSelector(".login_logo");
    private By usernameInput = By.cssSelector("input#user-name");
    private By passwordInput = By.cssSelector("input#password");
    private By loginButton = By.cssSelector("input#login-button");
    private By botGraphic = By.cssSelector(".bot_column");
    private By acceptedUsernamesLabel = By.cssSelector("#login_credentials h4");
    private By acceptedUsernamesList = By.cssSelector("#login_credentials");
    private By passwordLabel = By.cssSelector(".login_password h4");
    private By passwordForAllUsers = By.cssSelector(".login_password");

    // Actions
    public WebElement getSwagLabsLogo() {
        return driver.findElement(swagLabsLogo);
    }

    public LoginPage enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    public ProductsPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }

    public WebElement getBotGraphic() {
        return driver.findElement(botGraphic);
    }

    public String getAcceptedUsernamesLabel() {
        return driver.findElement(acceptedUsernamesLabel).getText();
    }

    public String getAcceptedUsernamesList() {
        return driver.findElement(acceptedUsernamesList).getText();
    }

    public String getPasswordLabel() {
        return driver.findElement(passwordLabel).getText();
    }

    public String getPasswordForAllUsers() {
        return driver.findElement(passwordForAllUsers).getText();
    }
}

//TODO he added class here as an assumption that is needed,
// when you are confirming that page is reached after click on login
// but it was also added in LoginPageTest file with additional method


// ProductsPage - stubbed as it is referenced in the loginButton navigation
//class ProductsPage {
//
//    private WebDriver driver;
//
//    public ProductsPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    // Additional page methods and locators would apply
//}
