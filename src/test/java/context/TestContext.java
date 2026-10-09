package context;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagemanager.PageManager;
import pages.*;

public class TestContext {

    private WebDriver driver;
    private PageManager pageManager;

    public TestContext() {

        System.out.println("....Test Context Constructor called....");
    }

    public void initialDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public WebDriver getDriver() {
        return driver;
    }


    public PageManager getPageManager() {

        if (pageManager == null) {
            pageManager =  new PageManager(driver);
        }

        return pageManager;

    }


}
