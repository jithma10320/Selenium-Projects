package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By electronicsLink = By.linkText("Electronics");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickElectronics() {
        click(electronicsLink);
    }
}
