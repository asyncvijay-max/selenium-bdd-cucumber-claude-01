package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    // store page link on Home Page
    private final By storePageLink = By.cssSelector("#menu-item-1227 > a");



    public void goToStorePageFromHomePage() throws InterruptedException {
     driver.get("https://askomdch.com/");
     Thread.sleep(2000);
     driver.findElement(storePageLink).click();
    }

}
