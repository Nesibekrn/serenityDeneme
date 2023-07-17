package stepDef;

import Pages.HomePage;
import Pages.ProduktPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class US_001StepDef {
    @Managed
    WebDriver driver;

    @Steps
    HomePage homePage;

    @Steps
    ProduktPage produktPage;

    @Given("I go to homepage")
    public void i_go_to_homepage() {
        driver.manage().window().maximize();
        driver.get("https://shop.westfalen.com/");
    }
    @When("I accept the cookie")
    public void IAcceptTheCookie() {
        homePage.acceptCookie.click();
        homePage.productOrtimentLink.waitUntilVisible();
    }
    @When("I click Produktsortiment")
    public void IClickProduktsortiment() {
        homePage.productOrtimentLink.waitUntilVisible();
        homePage.productOrtimentLink.click();
    }

    @Then("I verify that {string} url is visible")
    public void ıVerifyThatUrlIsVisible(String url) {
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }
    @And("I verify all products are visible")
    public void IVerifyAllProductsAreVisible() {
        produktPage.productNumberText.waitUntilVisible();
        String text = produktPage.productNumberText.getText().split(" ")[0].substring(1);
        System.out.println("text = " + text);
        int productCount = produktPage.productListItem.size();
        System.out.println("productCount = " + productCount);
        Assert.assertEquals(productCount, Integer.parseInt(text));
    }

    @Then("I verify titles are visible")
    public void ıVerifyTitlesAreVisible(DataTable dataTable) {
        List<String> titles = dataTable.column(0);
        System.out.println("titles = " + titles);
            List<String> elementTitles=new ArrayList<>();
            for (int i = 0; i <produktPage.categoryTitleList.size() ; i++) {
                elementTitles.add(produktPage.categoryTitleList.get(i).getText());
            }
            for (String title:titles) {
                Assert.assertTrue(elementTitles.contains(title));
        }

    }

    @And("I verify Dropdown is visible at the top of the page")
    public void ıVerifyDropdownIsVisibleAtTheTopOfThePage() {
    }

    @And("I verify Dropdown is visible at the bottom of the page")
    public void ıVerifyDropdownIsVisibleAtTheBottomOfThePage() {
    }

    @And("I verify Grid Icon is visible at the top of the page")
    public void ıVerifyGridIconIsVisibleAtTheTopOfThePage() {
    }

    @And("I verify Grid Icon is visible at the bottom of the page")
    public void ıVerifyGridIconIsVisibleAtTheBottomOfThePage() {
    }


    @When("I select Name Aufsteigend from Dropdown")
    public void ıSelectNameAufsteigendFromDropdown() {
    }

    @Then("I verify all products are sorted aufsteigned")
    public void ıVerifyAllProductsAreSortedAufsteigned() {
    }

    @When("I select Name Absteigend from Dropdown")
    public void ıSelectNameAbsteigendFromDropdown() {
    }

    @Then("I verify all products are sorted absteigend")
    public void ıVerifyAllProductsAreSortedAbsteigend() {
    }

    @When("I select Relevanz from Dropdown")
    public void ıSelectRelevanzFromDropdown() {
    }

    @Then("I verify all products are sorted relevanz")
    public void ıVerifyAllProductsAreSortedRelevanz() {
    }

    @And("I verify Grid Icon is visible")
    public void ıVerifyGridIconIsVisible() {
    }

    @And("I click Grid Icon")
    public void ıClickGridIcon() {
    }

    @And("I verify List Icon is visible")
    public void ıVerifyListIconIsVisible() {
    }

    @And("I select checkboxes for filtering")
    public void ıSelectCheckboxesForFiltering(DataTable dataTable) throws InterruptedException {
        List<String>texts=dataTable.column(0);
        for (String text:texts) {
            System.out.println("text = " + text);
            if (text.equals("stationärer/mobiler Vorrat")){
                produktPage.scrollToElement(produktPage.flaschentypButton);

               produktPage.flaschentypButton.waitUntilVisible();
                produktPage.flaschentypButton.click();

            }
            WebElement checkbox=driver.findElement(By.xpath("//a[@data-cx-focus='"+text+"']"));

            produktPage.scrollToElement(checkbox);

            checkbox.click();

        }
    }
}
