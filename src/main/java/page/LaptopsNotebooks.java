package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopsNotebooks extends AbstractPage {

    // links
    @FindBy(linkText = "HP LP3065")
    private WebElement itemNameHPLaptop;

    @FindBy(linkText = "MacBook")
    private WebElement itemNameMacBook;

    //@FindBy(linkText = "MacBook Air")
   @FindBy(css = "#content > div:nth-child(7) > div:nth-child(3) > div > div:nth-child(2) > div.caption > h4 > a")
       private WebElement itemNameMacBookAir;

    @FindBy(linkText = "MacBook Pro")
    private WebElement itemNameMacBookPro;

    @FindBy(linkText = "Sony VAIO")
    private WebElement itemNameSonyVAIO;

    //text

    // Constructor
    public LaptopsNotebooks(WebDriver driver) {
        super(driver);
    }

    public void clickHPLaptopItemName() {
        itemNameHPLaptop.click();
    }

    public void clickMacBookItemName() {
        itemNameMacBook.click();
    }

    public void clickMacBookAirItemName() {
        itemNameMacBookAir.click();
    }

    public void clickMacBookProItemName() {
        itemNameMacBookPro.click();
    }

    public void clickSonyVAIOItemName() {
        itemNameSonyVAIO.click();
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