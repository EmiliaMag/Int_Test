import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickOrderPObj extends PageObject {

    @FindBy(xpath = "//a[@href='/store/usassessments/en/quickOrder']")
    private WebElement quickOrderButton;

    @FindBy(xpath = "//ul[@class='item__list--header']")
    private WebElement isbnPCText;

    @FindBy(xpath = "//li[2]//input[@placeholder='Enter ISBN/Product code']")
    private WebElement isbnFieldQo;

    @FindBy(xpath = "//span[@class='item__name']")
    private WebElement qoProducNameAbas;

    public QuickOrderPObj(WebDriver driver) {
        super(driver);
    }

    public void clickOnQuickOrderButton() {
        quickOrderButton.click();
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


}
