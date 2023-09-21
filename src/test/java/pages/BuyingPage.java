package pages;

import utils.ReusableMethods;
import org.openqa.selenium.By;

public class BuyingPage extends ReusableMethods {

    private static final By HEADER_ELEMENT = By.xpath("//div[@class='pb-header']");
    private static final By TRASH_ELEMENT = By.xpath("//i[@class='i-trash']");
    private static final By DISCOUNT_ELEMENT = By.xpath("//span[@class='add-coupon-toggle-title']");
    private static final By SHOP_BUTTON_ELEMENT = By.xpath("//div[@class='pb-summary']//div[1]//a[1]//span[1]");
    private static final By UNDERSTAND_POPUP = By.xpath("//button[contains(text(),'Anladım')]");

    public BuyingPage clickBuyingElement(){
        click(UNDERSTAND_POPUP);
        return this;
    }

    public String isProductOnTheCart(){
        return getTextOfElement(HEADER_ELEMENT);
    }

    public boolean isTrashButtonClickable(){
        return isClickable(TRASH_ELEMENT);
    }

    public boolean isDiscountButtonClickable(){
        return isClickable(DISCOUNT_ELEMENT);
    }

    public boolean isShopButtonClickable(){
        return isClickable(SHOP_BUTTON_ELEMENT);
    }
}
