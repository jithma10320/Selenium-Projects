package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private final By cartItemPrice = By.xpath("//div[@class='grid-item-price']");
    private final By checkoutBtn=By.xpath("//button[@class='btn btn--primary btn--large']");
    private final By guestBtn=By.xpath("//button[@id='gxo-btn']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartItemPrice() {
        return find(cartItemPrice).getText();
    }
    public void printEstimatedTotal() {
        String total = getCartItemPrice();
        System.out.println("Estimated Total: " + total);
    }
    public void clickCheckoutBtn() {
        click(checkoutBtn);
    }
    public void clickGuestBtn() {
        click(guestBtn);
    }
}
