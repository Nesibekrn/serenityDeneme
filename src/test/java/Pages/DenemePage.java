package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DenemePage extends PageObject {
    public void clickProductortiment(){
        find(By.xpath("//*[@id=\"productNavigation\"]/span")).click();
//        find(By.xpath("(//*[contains(@class,'styles-module_slider__')]/a)[1]")).click();
    }

    public void clickAcceptCookies() {
        find(By.xpath("//button[contains(@class, 'accept-cookies-button')]")).click();
    }

    public void waitForVisibilityOfProductOrtiment(){
        find(By.xpath("//*[@id=\"productNavigation\"]/span")).waitUntilVisible();
    }
    public void waitForVisibilityOfCookieAlert(){
        find(By.xpath("//button[contains(@class, 'accept-cookies-button')]")).waitUntilVisible();
    }

//    @FindBy(xpath = "//button[@id='Alle Cookies zulassen']")
//   public WebElement alert;
}
