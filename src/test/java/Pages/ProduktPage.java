package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProduktPage extends PageObject {
    @FindBy(css = ".text--grey")
    public WebElementFacade productNumberText;
    @FindBy(xpath = "//h1")
    public WebElementFacade produktCategoryName;
    @FindBy(xpath = "//button[text()=' Flaschentyp ']")
    public WebElementFacade flaschentypButton;
    @FindBy(xpath = "//span[@class='button button--secondary']")
    public List<WebElementFacade> productListItem;
    @FindBy(xpath = "//button[@class='heading']")
    public List<WebElementFacade> categoryTitleList;
    public void scrollDown() {
        WebDriver driver = getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void scrollToElement(WebElement element) {
        WebDriver driver = getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
    }
}
