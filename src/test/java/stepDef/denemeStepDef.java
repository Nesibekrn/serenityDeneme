package stepDef;

import Pages.DenemePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;


public class denemeStepDef {
    @Managed
    WebDriver driver;

    @Steps
    DenemePage denemePage;

    @Given("Hans goes to url")
    public void hans_goes_to_url() {
        driver.manage().window().maximize();
        driver.get("https://shop.westfalen.com/");

    }

    @When("he clicks Productsortiment")
    public void heClicksProductsortiment() {
        denemePage.productOrtimentLink.waitUntilVisible();
        denemePage.productOrtimentLink.click();
    }

    @Then("he clicks Schweiß-, Schneid-, Lasergase section")
    public void heClicksSchweißSchneidLasergaseSection() {
        denemePage.schweißSchneidLasergaseLink.click();
    }

    @And("he verifies all products are visible")
    public void heVerifiesAllProductsAreVisible() {
        denemePage.productNumberText.waitUntilVisible();
        String text = denemePage.productNumberText.getText().split(" ")[0].substring(1);
        System.out.println("text = " + text);
        int productCount = denemePage.productListItem.size();
        System.out.println("productCount = " + productCount);
        Assert.assertEquals(productCount, Integer.parseInt(text));
    }

    @When("he accepts the cookie")
    public void heAcceptsTheCookie() {
        denemePage.acceptCookie.click();
        denemePage.productOrtimentLink.waitUntilVisible();
    }

    @And("he clicks {string} checkbox")
    public void heClicksSchweißSchneidLasergaseCheckbox(String checkboxText) throws InterruptedException {
        switch (checkboxText) {
            case "Schweiß-, Schneid-, Lasergase":
                if (!denemePage.schweissCheckbox.isSelected()) {
                    denemePage.schweissCheckbox.click();
                }
                break;
            case "Industriegase":
                if (!denemePage.industriegaseCheckbox.isSelected()) {
                    denemePage.industriegaseCheckbox.click();
                }
                break;
        }
    }

    @And("he verifies {string} is visible under Angewendete Filter")
    public void heVerifiesTheOptionIsVisibleUnderAngewendeteFilter(String optionText) {
        switch (optionText) {
            case "Schweiß-, Schneid-, Lasergase":
                Assert.assertTrue(denemePage.schweissTextFilter.isDisplayed());
                break;
            case "Industriegase":
                Assert.assertTrue(denemePage.industriegaseTextFilter.isDisplayed());
                break;
        }

    }
}
