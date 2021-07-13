package StepDef;

import PageObject.CartPagePageObject;
import PageObject.PageObject;
import PageObject.SignInPageObject;
import PageObject.StorePagePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddProductInCartWhenLogOutStepDefs {

    SignInPageObject storeButton = new SignInPageObject(DriverManager.getDriver()); //obj
    CartPagePageObject cartPage = new CartPagePageObject(DriverManager.getDriver());
    StorePagePageObject addToCart = new StorePagePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @Given("user visit the PearsonAssesment Page")
    public void user_visit_the_PearsonAssesment_Page() {
        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
        DriverManager.getDriver().manage().window().maximize();
    }

    @And("user closes pop-up")
    public void user_closes_popup() {
        storeButton.clickPopUpCloseButton();
        storeButton.clickClosePrivacyPopup2();
    }

    @When("user click on Store button from the header")
    public void user_click_on_Store_button_from_the_header() {
        storeButton.clickStoreButtonHeader();
    }

    @And("click on Sensory Profile Adult Product")
    public void clickOnSensoryProfileAdultProduct()  {
        navigator.implicitWait();
        navigator.scrollDown();
        addToCart.clickSensoryProfileAdultProductLink();
    }

    @And("click on Kits Format Card")
    public void clickOnKitsFormatCard() {
        navigator.scrollDown();
        addToCart.clickonKitsFormatCardSpaProduct();
    }

    @And("click on Add to Cart button")
    public void clickOnAddToCartButton() {
        navigator.scrollDown();
        addToCart.clickOnAddToCartButton();
    }

    @And("click on View Cart button from the Add to Cart pop-up")
    public void clickOnViewCartButtonFromTheAddToCartPopUp() throws InterruptedException {
        navigator.implicitWait();
        addToCart.clickOnViewCart();
    }

    @Then("the user should see the product in the cart")
    public void theUserShouldSeeTheProductInTheCart() {
        Assert.assertEquals("Adolescent/Adult Sensory Profile", cartPage.getProductNameFromCart());
    }


}
