package steps;

import context.TestContext;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    private final TestContext context;

    public HomePageSteps(TestContext context)
    {
        this.context = context;
    }

    @Given("Guest reaches Store Page")
    public void guest_reaches_store_page() throws InterruptedException {

        context.getHomePage().goToStorePageFromHomePage();

    }
}
