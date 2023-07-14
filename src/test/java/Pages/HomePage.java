package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    @FindBy(xpath = "//span[text()='Produktsuche']")
    public WebElementFacade productsucheIcon;
}
