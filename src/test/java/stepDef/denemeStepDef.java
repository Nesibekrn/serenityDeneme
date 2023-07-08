package stepDef;

import Pages.DenemePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class denemeStepDef {
    @Managed
    WebDriver driver;

    @Steps
    DenemePage denemePage;

    @Given("Hans goes to url")
    public void hans_goes_to_url() {
        driver.get("https://shop.westfalen.com/");
//        driver.get("https://www.trendyol.com/");
    }

    @When("he clicks Productsortiment")
    public void heClicksProductsortiment() {
//        denemePage.waitForVisibilityOfCookieAlert();
//        denemePage.clickAcceptCookies();
//        denemePage.waitForVisibilityOfProductOrtiment();
        denemePage.clickProductortiment();
    }
}
