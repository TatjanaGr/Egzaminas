import org.junit.Test;
import page.LaptopsNotebooks;
import page.MainPage;
import utils.WaitUtils;

import static org.junit.Assert.assertEquals;


public class TestLaptopsNotebooks extends BaseTest{
    private MainPage mainPage = new MainPage(driver);
    private LaptopsNotebooks laptopsNotebooks = new LaptopsNotebooks(driver);
    private WaitUtils waitUtils = new WaitUtils();

@Test
    public void testLaptopsNotebooks(){
    mainPage.clickButtonLaptopsNotebooks();
    mainPage.clickButtonShowAllLaptopsNotebooks();
    laptopsNotebooks.clickHPLaptopItemName();
    String availabilityInStock = "Availability: In Stock";
    String productName = "HP LP3065";

    assertEquals(laptopsNotebooks.findProductName(productName)+ "is Not In Stock", laptopsNotebooks.getAvailabilityText(availabilityInStock), availabilityInStock);

       if (laptopsNotebooks.getAvailabilityText(availabilityInStock).contains("Out Of Stock")) {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is Not In Stock");
    } else {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is In Stock");
    }
    mainPage.clickButtonLaptopsNotebooks();
    mainPage.clickButtonShowAllLaptopsNotebooks();
    waitUtils.waitForJS(driver);
    laptopsNotebooks.clickMacBookItemName();
    availabilityInStock = "Availability: Out Of Stock";
    productName ="MacBook";
    assertEquals(laptopsNotebooks.findProductName(productName)+ " is In Stock", laptopsNotebooks.getAvailabilityText(availabilityInStock), availabilityInStock);

    if (laptopsNotebooks.getAvailabilityText(availabilityInStock).contains("Out Of Stock")) {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is Not In Stock");
    } else {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is In Stock");
    }

    mainPage.clickButtonLaptopsNotebooks();
    mainPage.clickButtonShowAllLaptopsNotebooks();
    waitUtils.waitForJS(driver);
    laptopsNotebooks.clickMacBookAirItemName();
    waitUtils.waitForJS(driver);
    availabilityInStock = "Availability: Out Of Stock";
    productName ="MacBook Air";
    assertEquals(laptopsNotebooks.findProductName(productName)+ " is In Stock", laptopsNotebooks.getAvailabilityText(availabilityInStock), availabilityInStock);
    if (laptopsNotebooks.getAvailabilityText(availabilityInStock).contains("Out Of Stock")) {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is Not In Stock");
    } else {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is In Stock");
    }

    mainPage.clickButtonLaptopsNotebooks();
    mainPage.clickButtonShowAllLaptopsNotebooks();
    waitUtils.waitForJS(driver);
        laptopsNotebooks.clickMacBookProItemName();
    waitUtils.waitForJS(driver);
    availabilityInStock = "Availability: Out Of Stock";
    productName ="MacBook Pro";
    assertEquals(laptopsNotebooks.findProductName(productName)+ " is In Stock", laptopsNotebooks.getAvailabilityText(availabilityInStock), availabilityInStock);
    if (laptopsNotebooks.getAvailabilityText(availabilityInStock).contains("Out Of Stock")) {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is Not In Stock");
    } else {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is In Stock");
    }
    mainPage.clickButtonLaptopsNotebooks();
    mainPage.clickButtonShowAllLaptopsNotebooks();
    waitUtils.waitForJS(driver);
    laptopsNotebooks.clickSonyVAIOItemName();
    waitUtils.waitForJS(driver);
    availabilityInStock = "Availability: Out Of Stock";
    productName ="Sony VAIO";
    assertEquals(laptopsNotebooks.findProductName(productName)+ " is In Stock", laptopsNotebooks.getAvailabilityTextNew(availabilityInStock), availabilityInStock);
    if (laptopsNotebooks.getAvailabilityTextNew(availabilityInStock).contains("Out Of Stock")) {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is Not In Stock");
    } else {
        System.out.println(laptopsNotebooks.findProductName(productName) + " Is In Stock");
    }
}
}
