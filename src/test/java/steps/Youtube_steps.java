package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YoutubePage;
import utilities.Driver;

import java.security.Key;

public class Youtube_steps {

    YoutubePage you = new YoutubePage();


    @Given("user is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("https://www.youtube.com/");

    }

    @Given("User is able to see search box")
    public void user_is_able_to_see_search_box() {
        you.searchBox.isDisplayed();

    }

    @Given("User is able to see search button")
    public void user_is_able_to_see_search_button() {
        you.searchButton.isDisplayed();
        //Assert.assertTrue(you.searchBox.isDisplayed());
        //boyle de yazabiliriz


    }

    @When("User searches for funny cat videos")
    public void user_searches_for_funny_cat_videos() throws InterruptedException {
        Thread.sleep(2000);
        you.searchBox.sendKeys("funny cat videos" + Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("User should see reseults related to funny cat videos")
    public void user_should_see_reseults_related_to_funny_cat_videos() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cat"));
    }


    @When("User searches for funny dog videos")
    public void user_searches_for_funny_dog_videos() throws InterruptedException {
        Thread.sleep(2000);
        you.searchBox.sendKeys("funny dog videos"+Keys.ENTER);
        Thread.sleep(2000);


}

    @Then("User should see reseults related to funny dog videos")
    public void user_should_see_reseults_related_to_funny_dog_videos() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("dog"));


}

    @When("User searches for funny pet videos")
    public void user_searches_for_funny_pet_videos() throws InterruptedException {
        Thread.sleep(2000);
        you.searchBox.sendKeys("funny pet videos"+Keys.ENTER);
        Thread.sleep(2000);


}

@Then("User should see reseults related to funny pet videos")
public void user_should_see_reseults_related_to_funny_pet_videos() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("pet"));

}
}