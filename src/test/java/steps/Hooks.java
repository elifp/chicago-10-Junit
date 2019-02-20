package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.APIRunner;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        System.out.println("This is running before each scenario");

    }

    @After
    public void tearDown(Scenario scenario) {


        if (scenario.isFailed() && Driver.getDriverReference() != null) {  //if it is null we can't get screenshots(for api we are doing this because this for ui,we are trying to api)
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.embed(screenshot, "image/png");

        }

        if(scenario.isFailed() && APIRunner.getCr() != null ){
            scenario.write(APIRunner.getResponse().getJsonResponse());
        }
    }
}
