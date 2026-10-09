package pagemanager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageManager {

    private final WebDriver driver;

    private HomePage homePage;
    private StorePage storePage;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;
    private OrderConfirmationPage orderConfirmationPage;

    public PageManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public HomePage getHomePage()
    {
        if(homePage == null)
        {
            homePage = new HomePage(driver);
        }
        return homePage;
    }


    public StorePage getStorePage(){
        if(storePage == null)
        {
            storePage = new StorePage(driver);
        }

        return storePage;
    }

    public CartPage getCartPage()
    {
        if(cartPage ==  null)
        {
            cartPage = new CartPage(driver);
        }
        return cartPage;
    }

    public CheckOutPage getCheckOutPage()
    {
        if(checkOutPage == null)
        {
            checkOutPage = new CheckOutPage(driver);
        }

        return checkOutPage;
    }

    public OrderConfirmationPage getOrderConfirmationPage()
    {
        if(orderConfirmationPage == null)
        {
            orderConfirmationPage = new OrderConfirmationPage(driver);
        }
        return orderConfirmationPage;
    }
}
