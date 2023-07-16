package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageObject {
    @FindBy(xpath = "//span[text()='Produktsuche']")
    public WebElementFacade productsucheIcon;
    @FindBy(xpath = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElementFacade acceptCookie;
    @FindBy(xpath = "//*[@id='productNavigation']/span")
    public WebElementFacade productOrtimentLink;
    @FindBy(xpath = "//a[@class='navigation-node__child']")
    public List<WebElementFacade> productOrtimentAllLink;
//        public List<String> getExampleElementTexts() {
//            List<WebElementFacade> elements = productOrtimentAllLink;
//            return elements.stream()
//                    .map(WebElementFacade::getText)
//                    .collect(Collectors.toList());
//
//    }


}
