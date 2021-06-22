package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonesPDAs extends AbstractPage {

    // links
    @FindBy(linkText = "HTC Touch HD")
    private WebElement itemNameHTCTouchHD;

    @FindBy(linkText = "iPhone")
    private WebElement itemNameiPhone;

  //  @FindBy(linkText = "Palm Treo Pro")
   @FindBy(css = "#content > div:nth-child(3) > div:nth-child(3) > div > div:nth-child(2) > div.caption > h4 > a")
    private WebElement itemNamePalmTreoPro;

    //Constructor
    public PhonesPDAs(WebDriver driver) {
        super(driver);
    }

    public void clickHTCTouchHDItemName (){
        itemNameHTCTouchHD.click();
    }
    public void clickiPhoneItemName (){
        itemNameiPhone.click();
    }
    public void clickPalmTreoProItemName (){
        itemNamePalmTreoPro.click();
    }

    public String findProductName(String productName) {
        return driver.findElement(By.linkText(productName)).getText();
    }
    public String getAvailabilityText (String availabilityText) {
        return driver.findElement(By.cssSelector("#content > div > div.col-sm-4 > ul:nth-child(3) > li:nth-child(4)")).getText();
    }
    public String getAvailabilityTextNew (String availabilityText) {
        return driver.findElement(By.cssSelector("#content > div > div.col-sm-4 > ul:nth-child(3) > li:nth-child(3)")).getText();
    }
}
