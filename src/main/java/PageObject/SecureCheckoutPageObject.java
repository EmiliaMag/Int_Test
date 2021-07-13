package PageObject;

import PageObject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureCheckoutPageObject extends PageObject {

    @FindBy(xpath = "//label[2]//span[@class='c-radiobtn__check']")
    private WebElement addNewAddressRadioButton;

    @FindBy(xpath = "//input[@id='address.firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='address.surname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='address.line1']")
    private WebElement streetAddressField;

    @FindBy(xpath = "//input[@id='address.townCity']")
    private WebElement cityField;

    @FindBy(xpath = "//select[@id='address.region']")
    private WebElement stateDropDownList;

    @FindBy(xpath = "//select[@id='address.region']//option[@value='US-AZ']")
    private WebElement arizonaDropDownList;

    @FindBy(xpath = "//input[@id='address.postcode']")
    private WebElement zipCodeField;

    @FindBy(xpath = "//button[@id='addressSubmit']")
    private WebElement shippingAddressNextButton;

    @FindBy(xpath = "//button[@id='deliveryMethodSubmit']")
    private WebElement deliveryNextButton;

    @FindBy(xpath = "//input[@id='card_accountNumber']")
    private WebElement cardNumberField;

    @FindBy(xpath = "//select[@id='ExpiryMonth']")
    private WebElement expiryDateField;

    @FindBy(xpath = "//select[@id='ExpiryMonth']//option[@value='5']")
    private WebElement expiryDateField5Option;

    @FindBy(xpath = "//select[@id='ExpiryYear']")
    private WebElement expiryYearField;

    @FindBy(xpath = "//select[@id='ExpiryYear']//option[@value='2022']")
    private WebElement expiryYearField2022Option;

    @FindBy(xpath = "//input[@id='card_cvNumber']")
    private WebElement securityCodeField;

    @FindBy(xpath = "//div[@class='c-terms-conditions-area isBoxed']//span[@class='c-checkbox__check']")
    private WebElement termsAndConditionsCheckbox;


    //methods
    public SecureCheckoutPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddNewAddressRadioButton() {
        addNewAddressRadioButton.click();
    }

    public void clickOnFirstNameField() {
        firstNameField.click();
    }

    public void typeFirstName() {
        firstNameField.sendKeys("FirstName");
    }

    public void clickOnLastNameField() {
        lastNameField.click();
    }

    public void typeLastName() {
        lastNameField.sendKeys("LastName");
    }

    public void clickOnStreetAddressField() {
        streetAddressField.click();
    }

    public void typeStreetAddress() {
        streetAddressField.sendKeys("Address");
    }

    public void clickOnCityField() {
        cityField.click();
    }

    public void selectState() {
        arizonaDropDownList.click();
    }

    public void clickOnZipCodeField() {
        zipCodeField.click();
    }

    public void typeZipCode() {
        zipCodeField.sendKeys("85018");
    }

    public void clickAddressNextButton() {
        shippingAddressNextButton.click();
    }

    public void clickOnDeliveryNextButton() {
        deliveryNextButton.click();
    }

    public void clickOnCardNumberField() {
        cardNumberField.click();
    }

    public void typeCardNumber() {
        cardNumberField.sendKeys("3546456456456456");
    }

    public void clickOnMonthField() {
        expiryDateField.click();
    }

    public void selectOption5FromMonthField() {
        expiryDateField5Option.click();
    }

    public void clickOnYearField() {
        expiryYearField.click();
    }

    public void selectOption2022FromYearField() {
        expiryYearField2022Option.click();
    }

    public void clickOnSecurityCodeField() {
        securityCodeField.click();
    }

    public void typeSecurityCode() {
        securityCodeField.sendKeys("245");
    }

    public void clickOnTermsCheckbox() {
        termsAndConditionsCheckbox.click();
    }
}
