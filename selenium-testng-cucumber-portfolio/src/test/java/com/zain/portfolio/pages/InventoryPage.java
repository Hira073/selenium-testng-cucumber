package com.zain.portfolio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {
    private final By title = By.cssSelector("span.title");
    private final By cartBadge = By.cssSelector("span.shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return getText(title);
    }

    public void addProductToCart(String productName) {
        click(By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button"));
    }

    public void removeProductFromCart(String productName) {
        click(By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button[contains(text(),'Remove')]"));
    }

    public String getCartBadgeText() {
        return getText(cartBadge);
    }

    public boolean isCartBadgeVisible() {
        return isDisplayed(cartBadge);
    }
}
