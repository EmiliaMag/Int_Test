package PageObject;

import Fragments.AddToCartFragment;
import Utils.GetBy;
import Utils.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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

//    @FindBy(xpath = "//select[@id='ExpiryMonth']//option[@value='5']")
//    private WebElement expiryDateField5Option;

    @FindBy(xpath = "//select[@id='ExpiryYear']")
    private WebElement expiryYearField;

//    @FindBy(xpath = "//select[@id='ExpiryYear']//option[@value='2022']")
//    private WebElement expiryYearField2022Option;

    @FindBy(xpath = "//input[@id='card_cvNumber']")
    private WebElement securityCodeField;

    @FindBy(xpath = "//label[@class='c-checkbox']//input[@id='Terms1']")
    private WebElement termsAndConditionsCheckbox;

    @FindBy(xpath = "//label[@class='c-checkbox']//span[@class='c-checkbox__check']")
    private WebElement termsAndConditionsSpan;

    @FindBy(xpath = "//a[@href='/store/usassessments/en/checkout/multi/delivery-method/choose']")
    private WebElement shippingMethodTitle;

    @FindBy(xpath = "//a[@href='/store/usassessments/en/checkout/multi/summary/enter']")
    private WebElement paymentAndBillingTitle;

    @FindBy(xpath = "//select[@id='address.country']")
    private WebElement countryField;

    @FindBy(xpath = "//select[@id='address.country']//option[@value='CL']")
    private WebElement countryFieldsChileOption;

    @FindBy(xpath = "//button[@id='placeOrder']")
    private WebElement placeOrderButton;

    @FindBy(xpath = "//div[contains(@class, 'add-new-address')]")
    private WebElement addressForm;

    @FindBy(xpath = "//input[@class='form-control ui-autocomplete-input']")
    private WebElement searchAddressField;

    @FindBy(xpath = "//ol[@class='c-breadcrumb__list show-children--all']//a[@href='/store/usassessments/en/cart']")
    private WebElement backToCartBreadcrumb;


    //methods
    public SecureCheckoutPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddNewAddressRadioButton() {
        addNewAddressRadioButton.click();
    }

    public void clickOnFirstNameField() {
        firstNameField.clear();
        firstNameField.click();
    }

    public void typeFirstName() {
        firstNameField.sendKeys("FirstName");
    }

    public void clickOnLastNameField() {
        lastNameField.clear();
        lastNameField.click();
    }

    public void typeLastName() {
        lastNameField.sendKeys("LastName");
    }

    public void clickOnStreetAddressField() {
        streetAddressField.clear();
        streetAddressField.click();
    }

    public void typeStreetAddress() {
        streetAddressField.sendKeys("Address");
    }

    public void clickOnCityField() {
        cityField.click();
    }

    public void typesCityField() {
        cityField.clear();
        cityField.sendKeys("Phoenix");
    }

    public void clickOnStateField() {
        stateDropDownList.click();
    }

    public void selectState() {
        arizonaDropDownList.click();
    }

    public void clickOnZipCodeField() {
        zipCodeField.clear();
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

    public void typeCardNumber(String input) {
        cardNumberField.sendKeys(input);
    }

    public void clickOnMonthField() {
        expiryDateField.click();
    }

    public void selectOptionFromMonthField(String input) {
        Select month = new Select(driver.findElement(By.xpath("//select[@id='ExpiryMonth']")));
        month.selectByVisibleText(input);
        //expiryDateField5Option.click();
    }

    public void clickOnYearField() {
        expiryYearField.click();
    }

    public void selectOption2022FromYearField(String input) {
        Select year = new Select(driver.findElement(By.xpath("//select[@id='ExpiryYear']")));
        year.selectByVisibleText(input);
        // expiryYearField2022Option.click();
    }

    public void clickOnSecurityCodeField() {
        securityCodeField.click();
    }

    public void typeSecurityCode(String input) {
        securityCodeField.sendKeys(input);
    }

    public void clickOnTermsCheckbox() {
        clickWithJS(termsAndConditionsCheckbox);
    }           //click with JS

    public void clickOnTermsCheckboxWithActions() {
        Actions clickButton = new Actions(driver);
        //termsAndConditionsCheckbox.click();
        clickButton.moveToElement(termsAndConditionsSpan, -150, 0).click().perform();

    }                                       //click with Actions

    public String getShippingMethodText() {
        return shippingMethodTitle.getText();
    }

    public String getPaymentAndBillingText() {
        return paymentAndBillingTitle.getText();
    }

    public String getPlaceOrderButtonAttributeD() {
        return placeOrderButton.getAttribute("disabled");
        //return placeOrderButton.getCssValue("disabled");
    }

    public void clickOptionFromCountryDropdown(String country) {
        Select countryDropdown = new Select(countryField);
        countryDropdown.selectByVisibleText(country);
        Waits.waitUntilElementIsDisplayed(countryFieldsChileOption);
    }

    public void waitAddressFormDisplayed() {
        Waits.waitUntilElementIsDisplayed(addressForm);
    }

    public void clickOnSearchAddressField() {
        searchAddressField.click();
    }

    public void typeSearchAddressFieldInput() {
        searchAddressField.sendKeys("Emilia");
    }

    public void pressEnterSearchAddressField() {
        searchAddressField.sendKeys(Keys.ARROW_DOWN);
        searchAddressField.sendKeys(Keys.ARROW_DOWN);
        searchAddressField.sendKeys(Keys.ENTER);
    }

    public void clickOnSearchAddressFieldJS() {
        clickWithJS(searchAddressField);
    }

    public void clickOnBackToCartBreadcrumb() {
        backToCartBreadcrumb.click();
    }

    public void clickOnPlaceOrderButton() {
        placeOrderButton.click();
    }
}

