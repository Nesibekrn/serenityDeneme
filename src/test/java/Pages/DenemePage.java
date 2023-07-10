package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DenemePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"productNavigation\"]/span")
    public WebElementFacade productOrtimentLink;
@FindBy(xpath = "(//a[@class='navigation-node__child'])[1]")
    public WebElementFacade schweißSchneidLasergaseLink;
@FindBy(xpath = "")
    public WebElementFacade connectionMessageContentWrapper;
@FindBy(xpath = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElementFacade acceptCookie;

    @FindBy(css = ".text--grey")
    public WebElementFacade productNumberText;
    @FindBy(xpath = "//span[@class='button button--secondary']")
    public List<WebElementFacade> productListItem;

}
