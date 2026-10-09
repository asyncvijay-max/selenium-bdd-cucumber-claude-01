package steps;

import context.TestContext;
import io.cucumber.java.en.And;


public class CartPageSteps {

    private final TestContext context;

    public CartPageSteps(TestContext context)
    {
        this.context = context;

    }

    @And("Guest see the added product in the cart")
    public void guest_see_the_added_product_in_the_cart()
    {
        //Assertions can be added here

        //click the Go to Cart button from Cart Page
        context.getPageManager().getCartPage().clickOnCheckOutButton();

    }


}
