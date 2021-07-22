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

    public void clickSaveButton() {
        saveButton.click();
    }

}
