package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditOrganizationMembershipPageObject extends PageObject {

    @FindBy(xpath = "//select[@id='organisationType']")
    private WebElement organizationTypeDropdown;

    @FindBy(xpath = "//input[@id='membershipNumber']")
    private WebElement membershipNumber;


    //methods
    public void clickAndSelectFromTypeOfInstitutionDropdown(String input) {
        organizationTypeDropdown.click();
        Select organizationType = new Select(driver.findElement(By.xpath("//select[@id='organisationType']")));
        organizationType.selectByVisibleText(input);
    }

    public void clickAndSendInputMembershipNumber(String input) {
        membershipNumber.click();
        membershipNumber.sendKeys(input);
    }

    public EditOrganizationMembershipPageObject(WebDriver driver) {
        super(driver);
    }
}
