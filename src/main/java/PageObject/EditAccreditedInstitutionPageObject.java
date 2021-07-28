package PageObject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditAccreditedInstitutionPageObject extends PageObject {

    @FindBy(xpath = "//input[@id='institutionName']")
    private WebElement institutionNameField;

    @FindBy(xpath = "//select[@id='institutionType']")
    private WebElement typeOfInstitutionDropDown;

    @FindBy(xpath = "//select[@id='countryIso']")
    private WebElement countryDropDown;

    @FindBy(xpath = "//input[@id='streetAddress']")
    private WebElement streetField;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityField;

    @FindBy(xpath = "//select[@id='state']")
    private WebElement stateDropdown;

    @FindBy(xpath = "//input[@id='postalCode']")
    private WebElement zipField;

    @FindBy(xpath = "//select[@id='accreditedOption']")
    private WebElement accreditationStatus;

    //methods
    public EditAccreditedInstitutionPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickAndTypeOnInstitutionNameField(String input) {
        institutionNameField.clear();
        institutionNameField.click();
        institutionNameField.sendKeys(input);
    }

    public void clickAndSelectFromTypeOfInstitutionDropdown(String input) {
        typeOfInstitutionDropDown.click();
        Select typeOfInstitution = new Select(driver.findElement(By.xpath("//select[@id='institutionType']")));
        typeOfInstitution.selectByVisibleText(input);
    }

    public void clickAndSelectFromCountryDropdown(String input) {
        countryDropDown.click();
        Select country = new Select(driver.findElement(By.xpath("//select[@id='countryIso']")));
        country.selectByVisibleText(input);
    }

    public void clickAndTypeStreetAddressField(String input) {
        streetField.clear();
        streetField.click();
        streetField.sendKeys(input);
    }

    public void clickAndTypeCityField(String input) {
        cityField.clear();
        cityField.click();
        cityField.sendKeys(input);
    }

    public void clickAndSelectStateDropdown(String input) {
        stateDropdown.click();
        Select state = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        state.selectByVisibleText(input);
    }

    public void clickAndTypeZipCode(String input) {
        zipField.clear();
        zipField.click();
        zipField.sendKeys(input);
    }

    public void clickAndSelectAccreditationStatus(String input) {
        accreditationStatus.click();
        Select accreditation = new Select(driver.findElement(By.xpath("//select[@id='accreditedOption']")));
        accreditation.selectByVisibleText(input);
    }
}
