package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


    public class PricelistPage {
        WebDriver driver;

        public PricelistPage(){

            driver = Driver.getDriver();
            PageFactory.initElements(driver, this);

        }

        @FindBy(xpath="//a[contains(text(),'BriteErpDemo')]")
        public WebElement briteErpDemo;

        @FindBy(xpath="//input[@id='login']")
        public WebElement email;

        @FindBy(xpath="//input[@id='password']")
        public WebElement password;

        @FindBy(xpath="//button[@class='btn btn-primary']")
        public WebElement login;

        @FindBy(xpath = "//a[@data-menu-xmlid='point_of_sale.menu_pos_config_pos']/span[contains(text(), 'Point of Sale')]")
        public WebElement POSicon;

        @FindBy(xpath="//a[@data-menu='493']/span[contains(text(), 'Pricelists')]")
        public WebElement pricelists;

        @FindBy(xpath="//div[@class='@ table-responsive']")
        public WebElement listsName;

    }

