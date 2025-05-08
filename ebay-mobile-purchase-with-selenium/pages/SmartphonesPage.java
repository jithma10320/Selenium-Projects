package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SmartphonesPage extends BasePage {
    private final By smartphonesHeader = By.xpath("//h1[text()='Cell Phones & Smartphones']");

    public boolean isSmartphonesHeaderDisplayed() {
        return find(smartphonesHeader).isDisplayed();
    }

    private final By filter = By.xpath("//button[.//span[text()='Filter']]");
    private final By screenSizeFilter = By.xpath("//h3[text()='Screen Size']");
    private final By sixInchesOrMoreCheckbox = By.xpath("//input[@id='group-checkbox-6 in or More']");
    private final By applyButton = By.xpath("//button[contains(@class, 'btn-submit') and contains(@class, 'btn--primary')]");

    public SmartphonesPage(WebDriver driver) {
        super(driver);
    }
    public void clickFilter() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        click(filter);
    }
//    public void expandScreenSizeFilter() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement screenSize = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Screen Size']")));
//        click(screenSizeFilter);
//    }

    public void expandScreenSizeFilter() {
        click(screenSizeFilter);
    }

    public void selectSixInchesOrMore() {
        click(sixInchesOrMoreCheckbox);
    }

    public void clickApplyButton() {
        click(applyButton);
    }
}
