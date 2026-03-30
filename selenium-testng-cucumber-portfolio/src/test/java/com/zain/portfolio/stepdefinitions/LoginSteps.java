package com.zain.portfolio.stepdefinitions;

import com.zain.portfolio.core.DriverFactory;
import com.zain.portfolio.pages.InventoryPage;
import com.zain.portfolio.pages.LoginPage;
import com.zain.portfolio.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private final InventoryPage inventoryPage = new InventoryPage(DriverFactory.getDriver());

    @Given("I open the SauceDemo login page")
    public void iOpenTheSauceDemoLoginPage() {
        loginPage.open(ConfigReader.get("baseUrl"));
    }

    @When("I login with username {string} and password {string}")
    public void iLoginWithUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("I should land on the inventory page")
    public void iShouldLandOnTheInventoryPage() {
        Assert.assertEquals(inventoryPage.getPageTitle(), "Products", "Inventory page title mismatch");
    }

    @Then("I should see a login error message containing {string}")
    public void iShouldSeeALoginErrorMessageContaining(String expectedMessage) {
        Assert.assertTrue(loginPage.getErrorMessage().contains(expectedMessage), "Unexpected login error message");
    }
}
