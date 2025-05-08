package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElectronicsPage extends BasePage {

    private final By electronicsHeader = By.xpath("//h1[text()='Electronics']");

    public boolean isElectronicsHeaderDisplayed() {
        return find(electronicsHeader).isDisplayed();
    }

    private final By cellPhonesAndAccessoriesLink = By.linkText("Cell Phones & Accessories");

    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }

    public void clickCellPhonesAndAccessories() {
        click(cellPhonesAndAccessoriesLink);
    }

}
