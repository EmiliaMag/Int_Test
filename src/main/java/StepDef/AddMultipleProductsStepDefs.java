package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import PageObject.StorePagePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddMultipleProductsStepDefs {

    SignInPageObject storeButton = new SignInPageObject(DriverManager.getDriver()); //obj
    StorePagePageObject addToCart = new StorePagePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());

    @Given("user visit the PearsonAssesment's Home Page")
    public void userVisitThePearsonAssesmentsHomePage() {
        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
        DriverManager.getDriver().manage().window().maximize();
    }

    @When("user click on Store button")
    public void userClickOnStoreButton() {
        storeButton.clickStoreButtonHeader();
    }

    @Then("the user should see the Store Page with all the products")
    public void theUserShouldSeeTheStorePageWithAllTheProducts() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("317 Items found in Store", addToCart.getTotalNumberOfProducts());
    }


    @Given("user click on Sensory Profile Adult product")
    public void userClickOnSensoryProfileAdultProduct() {
        navigator.scrollDown();
        addToCart.clickSensoryProfileAdultProductLink();
    }

    @And("click on Continue Shopping button from the Add to Cart pop-up")
    public void clickOnContinueShoppingButtonFromTheAddToCartPopUp() throws InterruptedException {
        Thread.sleep(2000);
        addToCart.clickContinueShoppingOnPopUp();
    }

    @And("click on Store Button from the header")
    public void clickOnStoreButtonFromTheHeader() {
        storeButton.clickStoreButtonHeader();
    }

    @Then("user should see the Store Page with all the products")
    public void userShouldSeeTheStorePageWithAllTheProducts() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("317 Items found in Store", addToCart.getTotalNumberOfProducts());
    }

    @Given("user click on {string} product")
    public void userClickOnProduct(String arg0) {
    }
}
