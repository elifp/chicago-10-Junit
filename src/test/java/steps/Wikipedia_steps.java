package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikipediaPage;
import utilities.Driver;

public class Wikipedia_steps {
    WikipediaPage wkp = new WikipediaPage();

    @Given("user is on the Wikipedia homepage")
    public void user_is_on_the_Wikipedia_homepage() {
        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("User enters Steve Jobs to search bar and click enter")
    public void user_enters_flowers_Steve_Jobs_to_search_bar_and_click_enter() {
    wkp.searchBar.sendKeys("Steve Jobs" + Keys.ENTER);
    }

    @Then("User should see the first header is displayed Steve Jobs")
    public void user_should_see_the_first_header_is_displayed_Steve_Jobs() {
        Assert.assertEquals(wkp.firstHeading.getText(),"Steve Jobs");


    }

}
