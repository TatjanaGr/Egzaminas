import org.junit.Test;
import page.MainPage;
import page.Tablets;
import utils.WaitUtils;

import static org.junit.Assert.assertEquals;

public class TestTablets extends BaseTest{
    private MainPage mainPage = new MainPage(driver);
    private Tablets tablets = new Tablets(driver);
    private WaitUtils waitUtils = new WaitUtils();


    @Test
    public void testTablets() {
        mainPage.clickButtonTablets();
        waitUtils.waitForJS(driver);
        tablets.clickSamsungGalaxyItemName();


        String availabilityInStock = "Availability: Pre-Order";
        String productName = "Samsung Galaxy Tab 10.1";

        assertEquals(tablets.findProductName(productName) + "is Not In Stock", tablets.getAvailabilityText(availabilityInStock), availabilityInStock);
        if (tablets.getAvailabilityText(availabilityInStock).contains("Out Of Stock")) {
            System.out.println(tablets.findProductName(productName) + " Is Not In Stock");
        } else {
            System.out.println("Test passed all items are in Stock:");
            System.out.println(tablets.findProductName(productName) + " Is In Stock");
        }
    }
    }
