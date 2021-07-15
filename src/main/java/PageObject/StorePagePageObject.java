package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StorePagePageObject extends PageObject {

    @FindBy(xpath = "//div[@class='pagination-bar-results']//span")
    private WebElement totalItemsInStore;

    @FindBy(className = "control-label")
    private WebElement sortByTextLabel;

    @FindBy(xpath = "//span[@class='facet__text']//a[@class='js-track-singlefilter']")
    private WebElement cognitionAndNeuroCategory;

    @FindBy(xpath = "//div[@class='facet__values js-facet-values js-facet-form']//li[2]//span[@class='facet__value__count']")
    private WebElement academicLearningTotalItemsLabel;

    @FindBy(xpath = "//li[@class='product__list--item']//a[@class='product__list--name']")
    private WebElement ampacProductLink;

    @FindBy(xpath = "//ul[@class='product__listing product__list']//li[3]//a[@class='product__list--name']")
    private WebElement sensoryProfileAdultProductLink;

    @FindBy(xpath = "//button[@class='preferred-format__button']")
    private WebElement KitsFormatCardSpaProduct;

    @FindBy(xpath = "//button[@data-modal-content='#programDisplayAttributeInfoContainer-0761649700']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='button button--primary button--block add-to-cart-button']")
    private WebElement viewCartButtonPopUp;

    @FindBy(xpath = "//button[@class='button--secondary button--block js-mini-cart-close-button']")
    private WebElement continueShoppingButtonPopUp;

    @FindBy(xpath = "//h1[@class='program-details__name']")
    private WebElement ampacProgramName;

    @FindBy(xpath = "//a[@href='/store/usassessments/en/Store/c/store?q=%26%26relevance%26%26category%26%26behavior']")
    private WebElement behaviorCategoryFilter;

    @FindBy(xpath = "//div[@id='product-facet']//div[3]//div[1]//div[2]")
    private WebElement ageRangeDropDownButton;

    @FindBy(xpath = "//ul[@class='facet__list js-facet-list js-facet-top-values']//li[2]")
    private WebElement preschoolAgeRangeCheckbox;

    @FindBy(xpath = "//div[@class='pagination-bar-results']")
    private WebElement totalItemsWithSelectedFilter;

    @FindBy(xpath = "//a[@id='declineSurvey']")
    private WebElement surveyPopUp;

    @FindBy(xpath = "//div[@class='pagination-bar-results']")
    private WebElement totalNumberOfProducts;

    //methods
    public StorePagePageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnAmpacProductLink() {
        ampacProductLink.click();
    }

    public void clickSensoryProfileAdultProductLink() {
        sensoryProfileAdultProductLink.click();
    }

    public void clickonKitsFormatCardSpaProduct() {
        KitsFormatCardSpaProduct.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void clickOnViewCart() {
        viewCartButtonPopUp.click();
    }

    public String getAmpacTextName() {
        return ampacProgramName.getText();
    }

    public void clickBehaviorCategoryFilter() {
        behaviorCategoryFilter.click();
    }

    public void clickAgeRangeDropdown() {
        ageRangeDropDownButton.click();
    }

    public void clickPreschoolCheckbox() {
        preschoolAgeRangeCheckbox.click();
    }

    public String getTotalItemsWithFilters() {
        return totalItemsWithSelectedFilter.getText();
    }

    public String getTotalNumberOfProducts() {
        return totalNumberOfProducts.getText();
    }

    public void clickContinueShoppingOnPopUp() {
        continueShoppingButtonPopUp.click();
    }

    public void clickNoSurveyPopup() {
        surveyPopUp.click();
    }

}
