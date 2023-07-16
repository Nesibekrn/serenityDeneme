package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProduktPage extends PageObject {
    @FindBy(css = ".text--grey")
    public WebElementFacade productNumberText;
    @FindBy(xpath = "//h1")
    public WebElementFacade produktCategoryName;
    @FindBy(xpath = "//span[@class='button button--secondary']")
    public List<WebElementFacade> productListItem;
    @FindBy(xpath = "//button[@class='heading']")
    public List<WebElementFacade> categoryTitleList;

}
