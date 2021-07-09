package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObj;
import PageObject.StorePagePObj;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckProductsWithFilter {

    PageObject navigator = new PageObject(DriverManager.getDriver());
    SignInPageObj signIn = new SignInPageObj(DriverManager.getDriver()); //obj
    StorePagePObj storePage = new StorePagePObj(DriverManager.getDriver());

    @And("user closes the pop-up")
    public void userClosesThePopup() {
        signIn.clickPopUpCloseButton();
        signIn.clickClosePrivacyPopup2();
    }

    @And("click on Store button from the header")
    public void clickOnStoreButtonFromTheHeader() throws InterruptedException {
        Thread.sleep(2000);
        signIn.clickStoreButtonHeader();
    }

    @When("user click Behavior Category Filter")
    public void userClickBehaviorCategoryFilter() throws InterruptedException {
        Thread.sleep(2000);
        navigator.scrollDown();
        storePage.clickBehaviorCategoryFilter();
    }

    @And("click Age Range Dropdown")
    public void clickAgeRangeDropdown() throws InterruptedException {
        Thread.sleep(2000);
        navigator.scrollDown();
        navigator.scrollDown();
        storePage.clickAgeRangeDropdown();
    }

    @And("click Preschool Checkbox")
    public void clickPreschoolCheckbox() throws InterruptedException {
        navigator.scrollDown();
        storePage.clickPreschoolCheckbox();
    }

    @Then("the user should see the number of products according to the selected filters")
    public void theUserShouldSeeTheNumberOfProductsAccordingToTheSelectedFilters() {
        Assert.assertEquals("27 Items found in Store", storePage.getTotalItemsWithFilters());
    }
}
