package pages;

import config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    // store page link on Home Page
    private final By storePageLink = By.cssSelector("#menu-item-1227 > a");



    public void goToStorePageFromHomePage() throws InterruptedException {
      //driver.get("https://askomdch.com/");
      //driver.get(ConfigReader.getConfigReader().getBaseUrl());
        loadPage("/"); //This loads the Home Page

     Thread.sleep(2000);
     driver.findElement(storePageLink).click();
    }

}
