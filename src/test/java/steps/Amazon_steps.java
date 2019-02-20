package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.Driver;

public class Amazon_steps {
    AmazonPage a = new AmazonPage();

    @Given("User is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("https://amazon.com");

    }

    @When("User enters headphones keybaord")
    public void user_enters_headphones_keybaord() {
        a.searchBox.sendKeys("headphones");


    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
        a.searchButton.click();

    }

    @Then("User should see results related to headphones")
    public void user_should_see_results_related_to_headphones() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("headphones"));

    }

}
