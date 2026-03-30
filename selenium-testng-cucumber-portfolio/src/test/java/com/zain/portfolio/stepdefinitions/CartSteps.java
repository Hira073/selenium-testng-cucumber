package com.zain.portfolio.stepdefinitions;

import com.zain.portfolio.core.DriverFactory;
import com.zain.portfolio.pages.InventoryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartSteps {
    private final InventoryPage inventoryPage = new InventoryPage(DriverFactory.getDriver());

    @When("I add the product {string} to the cart")
    public void iAddTheProductToTheCart(String productName) {
        inventoryPage.addProductToCart(productName);
    }

    @When("I remove the product {string} from the cart")
    public void iRemoveTheProductFromTheCart(String productName) {
        inventoryPage.removeProductFromCart(productName);
    }

    @Then("the cart badge should display {string}")
    public void theCartBadgeShouldDisplay(String expectedCount) {
        Assert.assertEquals(inventoryPage.getCartBadgeText(), expectedCount, "Cart count mismatch");
    }

    @Then("the cart badge should not be visible")
    public void theCartBadgeShouldNotBeVisible() {
        Assert.assertFalse(inventoryPage.isCartBadgeVisible(), "Cart badge should not be visible");
    }
}
