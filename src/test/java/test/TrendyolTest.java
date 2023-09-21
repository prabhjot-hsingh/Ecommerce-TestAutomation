package test;

import pages.BuyingPage;
import pages.ProductListPage;
import pages.ProductPage;
import pages.TrendyolPage;
import utils.DriverFactory;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static utils.DriverFactory.driver;

public class TrendyolTest {

    private static TrendyolPage trendyolPage;
    private static ProductPage productPage;
    private static ProductListPage productListPage;
    private static BuyingPage buyingPage;

    @BeforeTest
    public void before(){
        DriverFactory.getDriver();
        trendyolPage = new TrendyolPage();
        productPage = new ProductPage();
        productListPage = new ProductListPage();
        buyingPage = new BuyingPage();
    }

    @Test(priority = 1 , description = "Search product and add to cart")
    public void searchProduct(){
        driver.navigate().to("https://www.trendyol.com/");
        trendyolPage.closePopup().categoryHoverOver();
        assertEquals(driver.getTitle(),"En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da");
        assertEquals(driver.getCurrentUrl(),"https://www.trendyol.com/");
        assertTrue(trendyolPage.trendyolLogoControl());
        assertTrue(trendyolPage.loginLogoControl());
        trendyolPage.searchProduct("samsung monitör").clickSearchButton();

        productListPage.clickProduct();
        productListPage.switchToTab();

        productPage.clickCartElement().clickGoToCartElement();
    }

    @Test(priority = 2 , description = "Verify Product and Buttons")
    public void checkProduct(){
        buyingPage.clickBuyingElement();
        assertEquals(buyingPage.isProductOnTheCart(),"Sepetim (1 Ürün)");
        assertTrue(buyingPage.isTrashButtonClickable());
        assertTrue(buyingPage.isDiscountButtonClickable());
        assertTrue(buyingPage.isShopButtonClickable());
    }
}


