package pages;

import utils.ReusableMethods;
import org.openqa.selenium.By;

public class ProductListPage extends ReusableMethods {

    private static final By PRODUCT_ELEMENT = By.xpath("//span[@title='LS22F350FHRXUF 21.5\" 60Hz 5ms (Analog+HDMI) Full HD LED Monitör']");

    public ProductListPage clickProduct(){
        click(PRODUCT_ELEMENT);
        return this;
    }
}
