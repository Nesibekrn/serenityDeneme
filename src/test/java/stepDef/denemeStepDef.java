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
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.Collections;


public class denemeStepDef {
    @Managed
    WebDriver driver;

    @Steps
    DenemePage denemePage;





    @Then("I click Schweiß-, Schneid-, Lasergase section")
    public void IClickSchweißSchneidLasergaseSection() {
        denemePage.schweißSchneidLasergaseLink.click();
    }





    @And("I click {string} checkbox")
    public void IClickSchweißSchneidLasergaseCheckbox(String checkboxText) throws InterruptedException {
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

    @And("I verify {string} is visible under Angewendete Filter")
    public void IVerifyTheOptionIsVisibleUnderAngewendeteFilter(String optionText) {
        WebElement element=driver.findElement(By.xpath("//cx-active-facets//span[.='"+optionText+"']"));
               Assert.assertTrue(element.isDisplayed());
        }
}
