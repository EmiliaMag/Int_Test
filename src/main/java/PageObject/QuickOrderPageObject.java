package PageObject;

import Utils.DriverManager;
import Utils.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickOrderPageObject extends PageObject {

    @FindBy(xpath = "//a[@href='/store/usassessments/en/quickOrder']")
    private WebElement quickOrderButton;

    @FindBy(xpath = "//ul[@id='mn-root--1228158151']")
    private WebElement quickOrderButtonNew;

    @FindBy(xpath = "//ul[@class='item__list--header']")
    private WebElement isbnPCText;

    @FindBy(xpath = "//li[2]//input[@placeholder='Enter ISBN/Product code']")
    private WebElement isbnFieldQo;

    @FindBy(xpath = "//span[@class='item__name']")
    private WebElement qoProducNameAbas;

    @FindBy(xpath = "//div[@class='orderSectionFooter']//button[@id='js-add-to-cart-quick-order-btn-bottom']")
    private WebElement addToCartButtonQuickOrderBottom;

    @FindBy(xpath = "//button[@id='js-add-to-cart-quick-order-btn-top']")
    private WebElement addToCartButtonTop;

    @FindBy(xpath = "//a[@class='button button--primary button--block add-to-cart-button']")
    private WebElement viewCartButton;

    @FindBy(xpath = "//h1[@class='orderSectionHeader__title']")
    private WebElement quickOrderPageTitle;

    @FindBy(xpath = "//button[@class='btn js-remove-quick-order-row']")
    private WebElement xButtonQuickOrder;

    @FindBy(xpath = "//button[@id='js-reset-quick-order-form-btn-bottom']")
    private WebElement resetFormButton;

    //methods
    public QuickOrderPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnQuickOrderButton() {
        quickOrderButtonNew.click();
    }

    public void clickIsbnField() {
        isbnFieldQo.click();
    }

    public void typeProductCode() {
        isbnFieldQo.sendKeys("0158009347");
    }

    public void clickIsbnPcText() {
        isbnPCText.click();
    }

    public String getProductNameAbas() {
        return qoProducNameAbas.getText();
    }

    public void clickOnAddToCartButtonQO() {
        addToCartButtonQuickOrderBottom.click();
    }

    public void clickOnAddToCartButtonTop() {
        Waits.waitUntilElementIsClickable(addToCartButtonTop);
        addToCartButtonTop.click();
    }

    public void clickOnViewCartButton() {
        viewCartButton.click();
    }

    public String getQuickOrderPageTitle() {
        return quickOrderPageTitle.getText();
    }

    public void clickOnXButton() {
        xButtonQuickOrder.click();
    }

    public String getAddtoCartButtonAttribute() {
        return addToCartButtonTop.getAttribute("disabled");
    }

    public void clickOnResetFormButton() {
        resetFormButton.click();
    }
}
