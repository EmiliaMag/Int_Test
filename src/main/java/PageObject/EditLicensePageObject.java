package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditLicensePageObject extends PageObject {

    @FindBy(xpath = "//select[@id='licenseType']")
    private WebElement certificationTypeDropDownList;

    @FindBy(xpath = "//input[@id='licenseNumber']")
    private WebElement certificationNumberField;

    @FindBy(xpath = "//input[@id='certAgency']")
    private WebElement certificationAgencyField;

    @FindBy(xpath = "//input[@id='qual-expirationDate']")
    private WebElement expirationDateField;

    @FindBy(xpath = "//select[@id='state']")
    private WebElement stateDropdown;


    public EditLicensePageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnCertificationTypeDropdown() {
        certificationTypeDropDownList.click();
    }

    public void selectOptionFromCertificationTypeDropdown(String input) {
        Select certType = new Select(driver.findElement(By.xpath("//select[@id='licenseType']")));
        certType.selectByVisibleText(input);
    }

    public void clickAndSendInputCertificationNumberField(String input) {
        certificationNumberField.click();
        certificationNumberField.sendKeys(input);
    }

    public void clickAndSendInputCertifyingAgencyField(String input) {
        certificationAgencyField.click();
        certificationAgencyField.sendKeys(input);
    }

    public void clickOnStateField() {
        stateDropdown.click();
    }

    public void selectOptionFromStateDropdown(String input) {
        Select state = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        state.selectByVisibleText(input);
    }

}
