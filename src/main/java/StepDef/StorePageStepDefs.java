package StepDef;

import PageObject.PageObject;
import PageObject.StorePagePageObject;
import Utils.DriverManager;
import Utils.Waits;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StorePageStepDefs {


    StorePagePageObject storePage = new StorePagePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());

    @And("customer go to Store Page")
    public void customerGoToStorePage() {
        Waits.implicitWait();
        DriverManager.getDriver().get("https://pearsonassessments-stg2.pearson.com/store/usassessments/en/Store/c/store");
        Waits.implicitWait();

    }

    @Then("customer should see the Ampac's Product Page")
    public void theUserShouldSeeTheAmpacSProductPage() {
        Assert.assertEquals("The title is incorrect", "Activity Measure for Post Acute Care", storePage.getAmpacTextName());
        navigator.closeBrowser();
    }

    @When("customer clicks Behavior Category Filter")
    public void userClickBehaviorCategoryFilter() {
        Waits.implicitWait();
        navigator.scrollDown();
        storePage.clickBehaviorCategoryFilter();
    }

    @And("customer clicks Age Range Dropdown")
    public void clickAgeRangeDropdown() {
        Waits.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();
        storePage.clickAgeRangeDropdown();
    }

    @And("customer clicks Preschool Checkbox")
    public void clickPreschoolCheckbox() {
        navigator.scrollDown();
        storePage.clickPreschoolCheckbox();
    }

    @Then("customer should see the number of products according to the selected filters")
    public void theUserShouldSeeTheNumberOfProductsAccordingToTheSelectedFilters() {
        Assert.assertEquals("Incorrect message", "27 Items found in Store", storePage.getTotalItemsWithFilters());
        navigator.closeBrowser();
    }

    @And("^customer clicks on \"(.*)\" Product Link$")
    public void clickOnSensoryProfileAdultProductLink(String isbn) {
        Waits.implicitWait();
        storePage.clickOnProgramTitle(isbn);
    }

    @And("customer clicks No button on the Survey Pop-up")
    public void clickNoButtonOnTheSurveyPopUp() {
        storePage.clickNoSurveyPopup();
    }

    @And("^customer clicks on \"(.*)\" Format Cart$")
    public void clickOnKitsFormatCartForSPAProduct(String title) {
        navigator.scrollDown();
        storePage.clickOnFormatCardTitle(title);
        //storePage.clickonKitsFormatCardSpaProduct();
    }

    @And("customer clicks on View Cart on the displayed pop-up")
    public void clickOnViewCartOnTheDisplayedPopUp() {
//        Waits.implicitWait();
        storePage.clickOnViewCart();
    }

    @And("^customer clicks on Add to Cart Button from the product with isbn: \"(.*)\"$")
    public void clickOnAddToCartButton(String isbn) {
        navigator.scrollDown();
        storePage.clickOnAddToCartButton(isbn);
        //storePage.clickOnAddToCartButton();
    }

    @And("customer clicks on View Cart button from the Add to Cart pop-up")
    public void clickOnViewCartButtonFromTheAddToCartPopUp() {
        Waits.implicitWait();
        storePage.clickOnViewCart();
    }

    @And("customer clicks on Top Button from the bottom-right side of the page")
    public void clickOnTopButton() {
        storePage.clickTopButton();
    }

    @And("customer scrolls to the bottom of the page")
    public void scrollToBottomPage() {
        Waits.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();

    }

    @Then("customer should see the alert message on the header of the page")
    public void customerShouldSeeTheHeaderOfThePage() {
        Assert.assertEquals("The messages are not identical", "What can we help you find?", storePage.getAlertMessageText());
        navigator.closeBrowser();

    }

}
