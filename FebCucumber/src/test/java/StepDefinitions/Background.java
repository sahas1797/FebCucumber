package StepDefinitions;

import io.cucumber.java.en.*;

public class Background {




    @Given("The user is in his homepage")
    public void the_user_is_in_his_homepage() {
        System.out.println("User is in his Login page");
    }

    @When("The user click on add to cart")
    public void the_user_click_on_add_to_cart() {
        System.out.println("User is selecting a product and adding it to cart");
    }

    @Then("The items must be moved to cart")
    public void the_items_must_be_moved_to_cart() {
        System.out.println("The added items are present in cart");
    }






    @Given("The user is in his login")
    public void the_user_is_in_his_login() {
        System.out.println("User is logged in to his account");
    }

    @When("the user clicks on payment and Checkout")
    public void the_user_clicks_on_payment_and_checkout() {
        System.out.println("User is clicking on payments and checkout");
    }

    @Then("The user should land in payments page")
    public void the_user_should_land_in_payments_page() {
        System.out.println("User is on payments page");
    }



}
