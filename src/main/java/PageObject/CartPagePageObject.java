package PageObject;

import Fragments.FormatCardsFragment;
import Fragments.ProductInCartFragment;
import Utils.GetBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "//div[@id='cboxLoadedContent']//input[@id='saveCartName']")
    private WebElement saveCartNameFieldPopup;

    @FindBy(xpath = "//div[@id='cboxLoadedContent']//button[@class='button--primary button--block']")
    private WebElement saveButtonSaveCartPopup;

    @FindBy(xpath = "//p[@class='c-alert__text']")
    private WebElement saveCartUpdateMessage;

    @FindBy(xpath = ".//li[@class='item__list--item--wrapper']")
    private List<WebElement> productInCartList;


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

    public void clickSaveButtonSaveCartPopup() {
        saveButtonSaveCartPopup.click();
    }

    public String getSaveCartUpdateMessage() {
        return saveCartUpdateMessage.getText();
    }


    //Products in Cart  - find qty field
    public WebElement getProductInCartByIsbn(String isbn) {
        By isbnBy = GetBy.getBy("productIsbn", ProductInCartFragment.class);
        By qtyField = GetBy.getBy("productQtyField", ProductInCartFragment.class);
        return productInCartList.stream()
                .filter(searchResultFragment -> searchResultFragment.findElement(isbnBy).getText().contains(isbn))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Unable to find a the field: " + isbn))
                .findElement(qtyField);
    }

    public void clickOnQtyFieldIsbn(String isbn) {
        getProductInCartByIsbn(isbn).click();
    }

    public void deleteQtyFieldInput(String isbn) {
        getProductInCartByIsbn(isbn).sendKeys(Keys.BACK_SPACE);
    }

    public void typeQtyFieldInput(String value, String isbn) {
        getProductInCartByIsbn(isbn).sendKeys(value);
        getProductInCartByIsbn(isbn).sendKeys(Keys.ENTER);
    }


    //Products in Cart  - find remove button
    public WebElement getProductInCart(String isbn) {
        By isbnBy = GetBy.getBy("productIsbn", ProductInCartFragment.class);
        By xButton = GetBy.getBy("productXButton", ProductInCartFragment.class);
        By removeButton = GetBy.getBy("removeButton", ProductInCartFragment.class);

        return productInCartList.stream()
                .filter(searchResultFragment -> searchResultFragment.findElement(isbnBy).getText().contains(isbn))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Unable to find a the field: " + isbn))
                .findElement(xButton).findElement(removeButton);
    }

    public void clickOnXButton(String isbn) {
        getProductInCart(isbn).click();
    }


}
