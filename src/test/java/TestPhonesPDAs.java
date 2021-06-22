import org.junit.Test;
import page.MainPage;
import page.PhonesPDAs;
import utils.WaitUtils;

import static org.junit.Assert.assertEquals;

public class TestPhonesPDAs extends BaseTest {
    private MainPage mainPage = new MainPage(driver);
    private PhonesPDAs phonesPDAs = new PhonesPDAs(driver);
    private WaitUtils waitUtils = new WaitUtils();


    @Test
    public void testPhonesPDAs() {
        mainPage.clickButtonPhonesPDAs();
        waitUtils.waitForJS(driver);
        phonesPDAs.clickHTCTouchHDItemName();

        String availabilityInStock = "Availability: In Stock";
        String productName = "HTC Touch HD";

        assertEquals(phonesPDAs.findProductName(productName) + "is Not In Stock", phonesPDAs.getAvailabilityText(availabilityInStock), availabilityInStock);
        if (phonesPDAs.getAvailabilityTextNew(availabilityInStock).contains("Out Of Stock")) {
            System.out.println(phonesPDAs.findProductName(productName) + " Is Not In Stock");
        } else {
            System.out.println(phonesPDAs.findProductName(productName) + " Is In Stock");
        }

        mainPage.clickButtonPhonesPDAs();
        waitUtils.waitForJS(driver);
        phonesPDAs.clickiPhoneItemName();

        availabilityInStock = "Availability: Out Of Stock";
        productName = "iPhone";

        assertEquals(phonesPDAs.findProductName(productName) + "Is In Stock", phonesPDAs.getAvailabilityTextNew(availabilityInStock), availabilityInStock);

        if (phonesPDAs.getAvailabilityTextNew(availabilityInStock).contains("Out Of Stock")) {
            System.out.println(phonesPDAs.findProductName(productName) + " Is Not In Stock");
        } else {
            System.out.println(phonesPDAs.findProductName(productName) + " Is In Stock");
        }

        mainPage.clickButtonPhonesPDAs();
        waitUtils.waitForJS(driver);
        phonesPDAs.clickPalmTreoProItemName();

        availabilityInStock = "Availability: 2-3 Days";
        productName = "Palm Treo Pro";

        assertEquals(phonesPDAs.findProductName(productName) + "Is In Stock", phonesPDAs.getAvailabilityTextNew(availabilityInStock), availabilityInStock);
        if (phonesPDAs.getAvailabilityTextNew(availabilityInStock).contains("2-3 Days")) {
            System.out.println(phonesPDAs.findProductName(productName) + " Is Available In 2-3 Days");
        } else {
            System.out.println(phonesPDAs.findProductName(productName) + " Is In Stock");
        }

    }
}
