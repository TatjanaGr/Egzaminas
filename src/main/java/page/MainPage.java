package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class MainPage extends AbstractPage{

    // buttons
    @FindBy(linkText = "Laptops & Notebooks")
    private WebElement buttonLaptopsNotebooks;

    @FindBy(linkText = "Show All Laptops & Notebooks")
    private WebElement buttonShowAllLaptopsNotebooks;

    @FindBy(linkText = "Tablets")
    private WebElement buttonTablets;

    @FindBy(linkText = "Phones & PDAs")
    private WebElement buttonPhonesPDAs;

    // Constructor
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonLaptopsNotebooks (){
        buttonLaptopsNotebooks.click();
    }
    public void clickButtonShowAllLaptopsNotebooks (){
        buttonShowAllLaptopsNotebooks.click();
        WaitUtils.waitForJS(driver);
    }
    public void clickButtonTablets (){
        buttonTablets.click();
    }
    public void clickButtonPhonesPDAs (){
        buttonPhonesPDAs.click();
    }
}
