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
        click(getProductButton(productName, "add-to-cart"));
    }

    public void removeProductFromCart(String productName) {
        click(getProductButton(productName, "remove"));
    }

    public String getCartBadgeText() {
        return getText(cartBadge);
    }

    public boolean isCartBadgeVisible() {
        return isDisplayed(cartBadge);
    }

    private By getProductButton(String productName, String buttonAction) {
        String xpath = "//div[contains(@class,'inventory_item')][.//div[contains(@class,'inventory_item_name') and normalize-space()='" 
                + productName + "']]//button[contains(@id,'" + buttonAction + "')]";
        return By.xpath(xpath);
    }
}
