package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.PricelistPage;
import utilities.Driver;

import java.util.List;


public class Pricelist_steps {

        PricelistPage price = new PricelistPage();

        @Given("user goes to BRITE ERP homepage")
        public void user_goes_to_BRITE_ERP_homepage() {

            Driver.getDriver().get("http://52.39.162.23");

        }

        @When("user should select BriteErpDemo")
        public void user_should_select_BriteErpDemo() throws InterruptedException {

            price.briteErpDemo.click();

        }

        @Then("user should enter valid credential\\(email and password) and click on log in button")
        public void user_should_enter_valid_credential_email_and_password_and_click_on_log_in_button() {



            price.email.sendKeys("in_pos_manager2@info.com");

            price.password.sendKeys("KjKtfgrs31"+Keys.ENTER);





        }

        @Then("user should select Point of Sale section")
        public void user_should_select_Point_of_Sale_section(){
            Actions action=new Actions(Driver.getDriver());
            action.click(price.POSicon);



        }

        @Then("user should see pricelist under category")
        public void user_should_see_pricelist_under_category() {
        Actions action=new Actions(Driver.getDriver());
        action.click(price.pricelists);
        


        }

        @Then("user should see {string} item name under pricelistnames which already created")
        public void user_should_see_item_name_under_pricelistnames_which_already_created(String earphone) {
            List<WebElement> names=Driver.getDriver().findElements(By.xpath("//table//tbody//tr"));
            for(WebElement name:names) {
                System.out.println(name.getText());

                if (name.getText().equals(earphone)) {

                    System.out.println("Listsnames verification is passed,item found");
                }
                else{
                    System.out.println("Not found");
                }
            }
        }
    }

