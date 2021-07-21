package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPagePageObject extends PageObject {

    @FindBy(xpath = "//div[@class='item__description']//div[@class='item__ISBN']")
    private WebElement itemISBN;

    @FindBy(xpath = "//div[@class='c-cart-voucher js-voucher-respond']//em")
    private WebElement promotionCodeDescription;

    @FindBy(xpath = "//div[@class='col-xs-12 notice']//em")
    private WebElement itemsSubtotalDescription;

    @FindBy(xpath = "//div[@class='col-xs-4 col-md-6 cart-totals-right text-right']")
    private WebElement itemsSubtotalPrice;

    @FindBy(xpath = "//div[@class='col-xs-5 col-md-6 cart-totals-right text-right grand-total js-total-price']")
    private WebElement estimateOrderTotalPrice;

    @FindBy(xpath = "//div[@class='c-alert__content']//p[@class='c-alert__text']")
    private WebElement quantityUpdatedMessage;

    @FindBy(xpath = "//input[@id='quantity_0']")
    private WebElement qtyField;

    @FindBy(xpath = "//div[@class='program_name']//a[@href='/store/usassessments/en/Store/Professional-Assessments/Motor-Sensory/Adolescent-Adult-Sensory-Profile/p/100000434.html']")
    private WebElement productNameCart;

    @FindBy(xpath = "//button[@class='button--secondary button--block save__cart--link cart__head--link js-save-cart-link']")
    private WebElement saveCartButton;

    @FindBy(xpath = "//button[@class='button--ctap button--block btn--continue-checkout js-continue-checkout-button js-track-checkoutstep js-sticky-anchor']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//span[@class= 'item__name']")
    private WebElement sensoryProfileProductTitle;

    @FindBy(xpath = "//button[@class='btn btn-default js-cartItemDetailBtn']")
    private WebElement xButtonOnTheRightOfTheFirstElement;

    @FindBy(xpath = "//a[@class='js-track-removecartitem']")
    private WebElement removeButton;

    @FindBy(xpath = "//p[@class='c-alert__text']")
    private WebElement removeProductAlertMessage;

    @FindBy(xpath = "//div[@class='program_name']")
    private WebElement abasProductLink;

    @FindBy(xpath = "//input[@id='saveCartName']")
    private WebElement saveCartNameFieldPopup;

    @FindBy(xpath = "//div[@class='col-xs-12']//button[@class='button--primary button--block']")
    private WebElement saveButtonSaveCartPopup;


    //methods
    public CartPagePageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnEstimateOrder() {
        estimateOrderTotalPrice.click();
    }

    public void clickOnQtyField() {
        qtyField.click();
    }

    public void deleteTheQtyFieldValue() {
        qtyField.sendKeys(Keys.BACK_SPACE);
    }

    public void typeQtyField() {
        qtyField.sendKeys("3");
    }

    public void enterValueTypedQty() {
        qtyField.sendKeys(Keys.ENTER);
    }

    public String getQuantityUpdatedMessage() {
        return quantityUpdatedMessage.getText();
    }

    public String getProductNameFromCart() {
        return productNameCart.getText();
    }

    public void clickOnSaveCartButton() {
        saveCartButton.click();
    }

    public void clickOnCheckoutButton() {
        checkoutButton.click();
    }

    public String getSensoryProfileProductTitle() {
        return sensoryProfileProductTitle.getText();
    }

    public void clickOnTheXButton() {
        xButtonOnTheRightOfTheFirstElement.click();
    }

    public void clickOnRemoveButton() {
        removeButton.click();
    }

    public String getRemoveAlertMessageText() {
        return removeProductAlertMessage.getText();
    }

    public String getAbasLinkText() {
        return abasProductLink.getText();
    }

    public void clickCartNameFieldPopUp() {
        saveCartNameFieldPopup.click();
    }

    public void typeCartNameFieldPopupName() {
        saveCartNameFieldPopup.sendKeys("Name");
    }

    public void clickSaveButtonSaveCartPopup () {
        saveButtonSaveCartPopup.click();
    }
}
