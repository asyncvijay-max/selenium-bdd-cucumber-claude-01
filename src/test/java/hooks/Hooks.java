package hooks;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private final TestContext context;


    public Hooks(TestContext context)
    {
        System.out.println("..Hooks constructor called....");
        this.context = context;
    }

    @Before
    public void setup()
    {
        context.initialDriver();
        System.out.println("inside SETUP of before hook..");

    }


    @After
    public void teardown()
    {
        System.out.println("inside TEAR DOWN of after hook..");

        if(context.getDriver() != null) {

            context.getDriver().quit();
        }
    }
}
