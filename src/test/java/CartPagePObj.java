import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPagePObj extends PageObject {
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

    @FindBy(xpath = "//span[@class='item__name']")
    private WebElement productNameCartAspck;

    @FindBy(xpath = "//input[@id='quantity_0']")
    private WebElement qtyField;

    public CartPagePObj(WebDriver driver) {
        super(driver);
    }

    public void clickOnEstimateOrder() {
        estimateOrderTotalPrice.click();
    }

    public String getAspckProductName() {
        return productNameCartAspck.getText();
    }

    public void clickOnQtyField() {
        qtyField.click();
    }
    public void deleteTheQtyFieldValue() {
        qtyField.clear();
    }
    public void typeQtyField() {
        qtyField.sendKeys("3");
    }
}
