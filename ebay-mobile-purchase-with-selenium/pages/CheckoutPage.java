package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

    private final By firstNameField = By.id("firstName");
    private final By lastNameField = By.id("lastName");
    private final By addressField = By.id("addressLine1");
    private final By cityField = By.id("city");
    private final By provinceField = By.id("stateOrProvince");
    private final By zipCodeField = By.id("postalCode");
    private final By emailField = By.id("email");
    private final By confirmEmailField = By.id("emailConfirm");
    private final By phoneField = By.id("phoneNumber");
    private final By doneButton = By.xpath("//button[@class='btn btn--primary']");


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void fillShippingInfo(String firstName, String lastName, String address, String city, String province, String zip,String email, String phone) {
        find(firstNameField).sendKeys(firstName);
        find(lastNameField).sendKeys(lastName);
        find(addressField).sendKeys(address);
        find(cityField).sendKeys(city);
        find(provinceField).sendKeys(province);
        find(zipCodeField).sendKeys(zip);
        find(emailField).sendKeys(email);
        find(confirmEmailField).sendKeys(email);
        find(phoneField).sendKeys(phone);
    }

    public void clickDoneBtn(){
        click(doneButton);
    }
}
