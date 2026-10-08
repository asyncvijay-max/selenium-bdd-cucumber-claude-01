package context;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

public class TestContext {

    private WebDriver driver;

    private HomePage homePage;
    private StorePage storePage;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;
    private OrderConfirmationPage orderConfirmationPage;

    public TestContext()
    {
        System.out.println("....Test Context Constructor called....");
    }

    public void initialDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public WebDriver getDriver()
    {
        return driver;
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
