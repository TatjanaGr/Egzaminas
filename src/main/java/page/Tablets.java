package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tablets extends AbstractPage {

    // links
    @FindBy(linkText= "Samsung Galaxy Tab 10.1")
    private WebElement itemNameSamsungGalaxy;

    // Constructor
    public Tablets(WebDriver driver) {
        super(driver);
    }

    public void clickSamsungGalaxyItemName (){
        itemNameSamsungGalaxy.click();
    }
    public String findProductName(String productName) {
        return driver.findElement(By.linkText(productName)).getText();
    }
    public String getAvailabilityText (String availabilityText) {
        return driver.findElement(By.cssSelector("#content > div > div.col-sm-4 > ul:nth-child(3) > li:nth-child(3)")).getText();
    }

}
