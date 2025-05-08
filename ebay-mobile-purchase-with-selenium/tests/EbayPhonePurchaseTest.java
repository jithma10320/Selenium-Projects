package tests;

import tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class EbayPhonePurchaseTest extends BaseTest {

    @Test
    public void testEbayPhonePurchaseFlow() {
        // Home Page
        HomePage homePage = new HomePage(driver);
        homePage.clickElectronics();

        // Electronics Page
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        Assert.assertTrue(electronicsPage.isElectronicsHeaderDisplayed(), "Electronics header not displayed");
        electronicsPage.clickCellPhonesAndAccessories();

        // Cell Phones & Accessories Page
        CellPhonesAccessoriesPage cellPage = new CellPhonesAccessoriesPage(driver);
        Assert.assertTrue(cellPage.isCellPhonesAccessoriesHeaderDisplayed(), "Cell Phones & Accessories header not displayed");
        cellPage.clickCellPhonesAndSmartphones();

        // Smartphones Page
        SmartphonesPage smartphonesPage = new SmartphonesPage(driver);
        Assert.assertTrue(smartphonesPage.isSmartphonesHeaderDisplayed(), "Smartphones header not displayed");
        smartphonesPage.clickFilter();
        smartphonesPage.expandScreenSizeFilter();
        smartphonesPage.selectSixInchesOrMore();
        smartphonesPage.clickApplyButton();

        // Products Page
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(), "Filtered products header not displayed");
        productsPage.clickFirstItem();
        productsPage.printFirstItemName();
        productsPage.printFirstItemPrice();

        // Switch to the new tab (product page)
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Add to Cart
        productsPage.clickAddToCart();

        // Cart Page
        CartPage cartPage = new CartPage(driver);
        cartPage.printEstimatedTotal();
        cartPage.clickCheckoutBtn();
        cartPage.clickGuestBtn();

        // Checkout Page
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillShippingInfo(
                "Jithma", "Hathwella", "123 Main St", "Kesbewa", "WEstern", "10320", "jithmahathwella@gmail.com", "765570719"
        );
        checkoutPage.clickDoneBtn();

        // Pause to visually verify (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            }
}
