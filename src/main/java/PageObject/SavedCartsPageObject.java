package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedCartsPageObject extends PageObject {

    @FindBy(xpath = "//div[@class='restore-item-column']")
    private WebElement restoreButton;

    @FindBy(xpath = "//button[@class='js-save-cart-restore-btn button--primary button--block js-track-restorecart']")
    private WebElement restoreButtonPopup;



    public void clickOnRestoreButton() {
        restoreButton.click();
    }

    public void clickOnRestoreButtonPopup() {
        restoreButtonPopup.click();
    }

    public SavedCartsPageObject(WebDriver driver) {
        super(driver);
    }

}
