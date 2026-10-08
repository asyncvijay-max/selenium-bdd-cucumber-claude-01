package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage extends BasePage {
    public StorePage(WebDriver driver) {
        super(driver);
    }

    private final By searchTextBox = By.id("woocommerce-product-search-field-0");
    private final By searchButton = By.cssSelector("[value='Search']");
    private final By searchResults = By.cssSelector("#main h1");

    public void searchForTheProduct(String product)
    {
      driver.findElement(searchTextBox).sendKeys(product);

      driver.findElement(searchButton).click();


    }

    public String searchResultsText()
    {
        return driver.findElement(searchResults).getText();
    }



}
