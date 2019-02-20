package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    WebDriver driver;

    public AmazonPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(className = "nav-input")
    public WebElement searchButton;

}
