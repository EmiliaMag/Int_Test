package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddressPageObject extends PageObject {

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

    @FindBy(xpath = "//button[@class='button--primary button--block change_address_button show_processing_message']")
    private WebElement saveButton;

    //methods
    public AddAddressPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnFirstNameField() {
        firstNameField.clear();
        firstNameField.click();
    }

    public void typeFirstName(String input) {
        firstNameField.sendKeys(input);
    }

    public void clickOnLastNameField() {
        lastNameField.clear();
        lastNameField.click();
    }

    public void typeLastName(String input) {
        lastNameField.sendKeys(input);
    }

    public void clickOnStreetAddressField() {
        streetAddressField.clear();
        streetAddressField.click();
    }

    public void typeStreetAddress(String input) {
        streetAddressField.sendKeys(input);
    }

    public void clickOnCityField() {
        cityField.click();
    }

    public void typesCityField(String input) {
        cityField.clear();
        cityField.sendKeys(input);
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

    public void typeZipCode(String input) {
        zipCodeField.sendKeys(input);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

}
