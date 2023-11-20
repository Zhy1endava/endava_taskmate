package com.saucedemo.tests;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//TODO he used Junit4 as a runner, but there are other and newer options (Junit5, TestNG)
// so this should be configurable in a prompt
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Before
    public void setUp() {
        // Set up the ChromeDriver location
        //TODO assumption is that you want to define specific path to driver
        // newer versions on selenium do not are doing that automatically
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the driver
        driver = new ChromeDriver();

        // Navigate to the login page
        //TODO wrong base URL used probably he used picture only
//        driver.get("https://www.swaglabs.com/login");
        driver.get("https://www.saucedemo.com/v1/index.html");

        // Initialize the login page object
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        // Input valid username and password
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");

        // Click the login button and navigate to the ProductsPage
        productsPage = loginPage.clickLoginButton();

        // Assertion to check if the ProductsPage is displayed
        // This would be a method inside ProductsPage class that checks if a certain element is present
        Assert.assertTrue("User is not on the Products page.", productsPage.isOnProductsPage());
    }

    @After
    public void tearDown() {
        // Close the browser after test
        driver.quit();
    }
}

//TODO same as in LoginPage file, ProductsPage class was added here,
// but it should be separate file in pages, so I did that manually

// Assume ProductsPage has the following method for the assertion
//class ProductsPage {
//
//    private WebDriver driver;
//
//    public ProductsPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    // Placeholder for method to check if we are on the Products page
//    public boolean isOnProductsPage() {
//        // This would typically look for a unique element on the Products page to verify that it's displayed
//        // Return true if found, false otherwise
//        return driver.findElement(By.id("uniqueElementOnProductsPage")).isDisplayed();
//    }
//}

