package steps;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StorePageSteps {

    private final TestContext context;

    public StorePageSteps(TestContext context)
    {
        this.context = context;

    }

    @When("Guest search for {string}")
    public void guest_search_for(String pname) throws InterruptedException {
    context.getStorePage().searchForTheProduct(pname);
        Thread.sleep(2000);

    }

    @Then("Guest is able to search successfully")
    public void guest_is_able_to_search_successfully() throws InterruptedException {
        String searchResult = context.getStorePage().searchResultsText();
        Thread.sleep(2000);
        Assert.assertTrue(searchResult.contains("Search results:"));
    }

}
