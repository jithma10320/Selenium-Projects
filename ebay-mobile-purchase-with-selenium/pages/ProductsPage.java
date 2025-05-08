package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private final By productsHeader = By.xpath("//h1[text()='6 Inch or More Cell Phones & Smartphones']");
    private final By firstItem = By.xpath("(//ul[contains(@class, 'carousel__list')]/li)[1]");
    private final By firstItemName = By.xpath("//div[@class='vim x-item-title']//span[contains(@class, 'ux-textspans--BOLD')]");
    private final By firstItemPrice = By.xpath("//div[@class='x-price-primary']//span[@class='ux-textspans']");
    private final By addToCartButton = By.xpath("//a[@id='atcBtn_btn_1' and contains(@class, 'ux-call-to-action')]");
    //private final By cartIcon = By.id("gh-cart-n");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }

    public void clickFirstItem() {
        click(firstItem);
    }

    public String getFirstItemName() {
        return find(firstItemName).getText();
    }

    public String getFirstItemPrice() {
        return find(firstItemPrice).getText();
    }

    public void printFirstItemName() {
        String itemName = getFirstItemName();
        System.out.println("Item Name: " + itemName);
    }
    public void printFirstItemPrice() {
        String itemPrice = getFirstItemPrice();
        System.out.println("Item Price: " + itemPrice);
    }

    public void clickAddToCart() {
        click(addToCartButton);
    }
}


