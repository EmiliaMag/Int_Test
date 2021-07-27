package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditDegreePageObject extends PageObject {

    @FindBy(xpath = "//select[@id='degree']")
    private WebElement degreeDropDownList;

    @FindBy(xpath = "//h1[@class='c-sectionHeader hasBorderBottom']")
    private WebElement editDegreePageTitle;

    @FindBy(xpath = "//input[@id='majorField']")
    private WebElement majorField;

    @FindBy(xpath = "//input[@id='institution']")
    private WebElement institutionField;

    @FindBy(xpath = "//span[@class='c-checkbox__check']")
    private WebElement termsAndConditionsCheckbox;

    @FindBy(xpath = "//button[@class='button--primary button--block save-degree-btn']")
    private WebElement saveButton;


    //methods
    public EditDegreePageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnDegreeDropDown() {
        degreeDropDownList.click();
    }

    public void selectOptionFromDegreeField(String input) {
        Select degree = new Select(driver.findElement(By.xpath("//select[@id='degree']")));
        degree.selectByVisibleText(input);
    }

    public String getEditDegreePageTitle() {
        return editDegreePageTitle.getText();
    }

    public void clickAndSendInputMajorField(String input) {
        majorField.click();
        majorField.clear();
        majorField.sendKeys(input);
    }

    public void clickAndSendInputInstitutionField(String input) {
        institutionField.click();
        institutionField.clear();
        institutionField.sendKeys(input);
    }

    public void clickAcceptTerms() {
        termsAndConditionsCheckbox.click();
    }

    public void clickOnSaveButtonEditDegree() {
        saveButton.click();
    }

}
