package pages;

import utils.ReusableMethods;
import org.openqa.selenium.By;

public class ProductPage extends ReusableMethods {

    private static final By ADD_TO_CART_ELEMENT = By.xpath("//div[@class='add-to-basket-button-text']");
    private static final By GO_TO_CART_ELEMENT = By.xpath("//a[@class='goBasket']");

    public ProductPage clickCartElement(){
        click(ADD_TO_CART_ELEMENT);
        waitFor(6);
        return this;
    }

    public ProductPage clickGoToCartElement(){
        click(GO_TO_CART_ELEMENT);
        return this;
    }
}
