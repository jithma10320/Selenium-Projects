package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CellPhonesAccessoriesPage extends BasePage {
    private final By cellPhonesAndAccessoriesHeader = By.xpath("//h1[text()='Cell Phones, Smart Watches & Accessories']");

    public boolean isCellPhonesAccessoriesHeaderDisplayed() {
        return find(cellPhonesAndAccessoriesHeader).isDisplayed();
    }

    private final By cellPhonesAndSmartphonesLink = By.linkText("Cell Phones & Smartphones");

    public CellPhonesAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickCellPhonesAndSmartphones() {
        click(cellPhonesAndSmartphonesLink);
    }

}
