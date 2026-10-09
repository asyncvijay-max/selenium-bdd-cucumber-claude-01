package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    //This is a td in the row which shows the product added into Cart Page
    //You can extract text and then do assertion
    private final By productNameInTheCart = By.cssSelector("td.product-name > a");

    //check out button
    private final By checkOutBtn = By.cssSelector(".checkout-button");


    //ACTIONS
    public void clickOnCheckOutButton()
    {
     wait.until(ExpectedConditions.elementToBeClickable(checkOutBtn)).click();
    }

    public String getTextProductInTheCart()
    {
        return driver.findElement(productNameInTheCart).getText();
    }

}
