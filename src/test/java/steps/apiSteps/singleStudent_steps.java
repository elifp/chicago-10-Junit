package steps.apiSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.APIRunner;

public class singleStudent_steps {

    @When("user hits single student API with {string}")
    public void user_hits_single_student_API_with(String uri) {
        APIRunner.runGET(uri);


    }

    @Then("user tests for required attributes")
    public void user_tests_for_required_attributes() {
        System.out.println(APIRunner.getResponse().getFirstName());
        System.out.println(APIRunner.getResponse().getLastName());



        Assert.assertTrue(APIRunner.getResponse().getFirstName() !=null);
       // Assert.assertTrue(APIRunner.getResponse().getLastName() !=null);
        Assert.assertTrue(APIRunner.getResponse().getContact().getEmailAddress() !=null);
        Assert.assertTrue(APIRunner.getResponse().getCompany().getAddress().getCity() !=null);

        Assert.assertTrue("Student las name is missing",APIRunner.getResponse().getLastName() ==null);



    }
}
