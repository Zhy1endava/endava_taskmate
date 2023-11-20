package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By swagLabsLogo = By.cssSelector(".product_label");

    public boolean isOnProductsPage() {
        // This would typically look for a unique element on the Products page to verify that it's displayed
        // Return true if found, false otherwise
        //TODO he was using a placeholder here as ProductsPage sitemap was not provided
//        return driver.findElement(By.id("uniqueElementOnProductsPage")).isDisplayed();
        return driver.findElement(swagLabsLogo).isDisplayed();
    }
}