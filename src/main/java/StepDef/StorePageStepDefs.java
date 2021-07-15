package StepDef;

import PageObject.PageObject;
import PageObject.StorePagePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StorePageStepDefs {


    StorePagePageObject storePage = new StorePagePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @Then("customer should see the Ampac's Product Page")
    public void theUserShouldSeeTheAmpacSProductPage() {
        Assert.assertEquals("The title is incorrect", "Activity Measure for Post Acute Care", storePage.getAmpacTextName());
        navigator.closeBrowser();
    }

    @When("customer clicks Behavior Category Filter")
    public void userClickBehaviorCategoryFilter() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        storePage.clickBehaviorCategoryFilter();
    }

    @And("customer clicks Age Range Dropdown")
    public void clickAgeRangeDropdown() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();
        storePage.clickAgeRangeDropdown();
    }

    @And("customer clicks Preschool Checkbox")
    public void clickPreschoolCheckbox() throws InterruptedException {
        navigator.scrollDown();
        storePage.clickPreschoolCheckbox();
    }

    @Then("customer should see the number of products according to the selected filters")
    public void theUserShouldSeeTheNumberOfProductsAccordingToTheSelectedFilters() {
        Assert.assertEquals("Incorrect message", "27 Items found in Store", storePage.getTotalItemsWithFilters());
        navigator.closeBrowser();
    }

    @And("customer clicks on Sensory Profile Adult Product Link")
    public void clickOnSensoryProfileAdultProductLink() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        storePage.clickSensoryProfileAdultProductLink();
    }

    @And("customer clicks No button on the Survey Pop-up")
    public void clickNoButtonOnTheSurveyPopUp() {
        storePage.clickNoSurveyPopup();
    }

    @And("customer clicks on Kits Format Cart for SPA product")
    public void clickOnKitsFormatCartForSPAProduct() {
        navigator.scrollDown();
        storePage.clickonKitsFormatCardSpaProduct();
    }

    @And("customer clicks on View Cart on the displayed pop-up")
    public void clickOnViewCartOnTheDisplayedPopUp() throws InterruptedException {
//        navigator.implicitWait();
        storePage.clickOnViewCart();
    }

    @And("customer clicks on Sensory Profile Adult Product")
    public void clickOnSensoryProfileAdultProduct() {
        navigator.implicitWait();
        navigator.scrollDown();
        storePage.clickSensoryProfileAdultProductLink();
    }

    @And("customer clicks on Kits Format Card")
    public void clickOnKitsFormatCard() {
        navigator.scrollDown();
        storePage.clickonKitsFormatCardSpaProduct();
    }

    @And("customer clicks on add to Cart button")
    public void clickOnAddToCartButton() {
        navigator.scrollDown();
        storePage.clickOnAddToCartButton();
    }

    @And("customer clicks on View Cart button from the Add to Cart pop-up")
    public void clickOnViewCartButtonFromTheAddToCartPopUp() throws InterruptedException {
        navigator.implicitWait();
        storePage.clickOnViewCart();
    }

}
