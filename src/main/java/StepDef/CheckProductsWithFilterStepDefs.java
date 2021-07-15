package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import PageObject.StorePagePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckProductsWithFilterStepDefs {

    PageObject navigator = new PageObject(DriverManager.getDriver());
    SignInPageObject signIn = new SignInPageObject(DriverManager.getDriver()); //obj
    StorePagePageObject storePage = new StorePagePageObject(DriverManager.getDriver());


    @And("customer clicks on Store button from the header")
    public void clickOnStoreButtonFromTheHeader() throws InterruptedException {
        navigator.implicitWait();
        signIn.clickStoreButtonHeader();
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
        Assert.assertEquals( "Incorrect message","27 Items found in Store", storePage.getTotalItemsWithFilters());
        navigator.closeBrowser();
    }
}
