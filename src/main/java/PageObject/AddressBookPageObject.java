package PageObject;

import Utils.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPageObject extends PageObject {

    @FindBy(xpath = "//a[@class='c-sectionHeader__btn']")
    private WebElement addAddressButton;

    @FindBy(xpath = "//h1[@class='c-sectionHeader hasBorderBottom']")
    private WebElement addAddressPageTitle;

    @FindBy(xpath = "//span[@class='action-links glyphicon glyphicon-remove']")
    private WebElement removeSecondAddress;

    @FindBy(xpath = "//p[@class='c-alert__text']")
    private WebElement addressCreatedMessage;

    @FindBy(xpath = "//p[@class='c-alert__text']")
    private WebElement addressRemovedMessage;

    @FindBy(xpath = "//div[@id='cboxLoadedContent']//a[@class='button button--primary button--block']")
    private WebElement deleteButtonAddressPopup;



    public AddressBookPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddAddress() {
        addAddressButton.click();
    }

    public String getAddAddressPageTitle() {
        return addAddressPageTitle.getText();
    }

    public void clickXButtonSecondAddress() {
        removeSecondAddress.click();
    }

    public String getAddressCreatedMessage() {
        return addressCreatedMessage.getText();
    }

    public String getAddressRemovedMessage() {
        return addressCreatedMessage.getText();
    }

    public void clickDeleteButtonAddressPopup() {
        Waits.implicitWait();
        deleteButtonAddressPopup.click();
    }
}
