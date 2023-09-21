package pages;

import utils.ReusableMethods;
import org.openqa.selenium.By;

public class TrendyolPage extends ReusableMethods {

    private static final By POPUP = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
    private static final By TRENDYOL_LOGO = By.xpath("//img[@alt='Trendyol']");
    private static final By LOGIN_LOGO = By.xpath("//p[contains(text(),'Giriş Yap')]");
    private static final By SEARCH_BOX_ELEMENT = By.xpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div/input");
    private static final By SEARCH_BUTTON = By.xpath("//i[@class='cyrzo7gC']");
    private static final By HOVER_ELEMENT = By.className("category-header");

    public TrendyolPage closePopup(){
        click(POPUP);
        return this;
    }

    public TrendyolPage categoryHoverOver(){
        hoverOverMenu(HOVER_ELEMENT);
        return this;
    }

    public boolean trendyolLogoControl(){
        return isDisplayed(TRENDYOL_LOGO);
    }

    public boolean loginLogoControl(){
        return isDisplayed(LOGIN_LOGO);
    }

    public TrendyolPage searchProduct(String product){
        sendKeys(SEARCH_BOX_ELEMENT,product);
        return this;
    }

    public TrendyolPage clickSearchButton(){
        click(SEARCH_BUTTON);
        scrollDown(300);
        return this;
    }
}
