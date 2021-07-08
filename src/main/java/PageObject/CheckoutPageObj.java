package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageObj extends PageObject {

    @FindBy(xpath = "//div[@class='col-md-12']//h1[@class='c-sectionHeader']")
    private WebElement secureCheckoutPageTitle;

    @FindBy(xpath = "//label[2]//span[@class='c-radiobtn__check']")
    private WebElement addNewAddressRadioBox;

    @FindBy(xpath = "//input[@id='address.firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='address.surname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='address.line1']")
    private WebElement streetAddressField;

    @FindBy(xpath = "//input[@id='address.townCity']")
    private WebElement cityField;

    @FindBy(xpath = "//input[@id='address.region']")
    private WebElement stateField;

    public String getSecureCheckoutTitleText() {
        return secureCheckoutPageTitle.getText();
    }

    public void clickAddNewAddress() {
        addNewAddressRadioBox.click();
    }

    public void typeFirstName() {
        firstNameField.sendKeys("Name");
    }

    public CheckoutPageObj(WebDriver driver) {
        super(driver);
    }


}
