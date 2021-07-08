package StepDef;

import PageObject.CartPagePObj;
import PageObject.PageObject;
import PageObject.SignInPageObj;
import PageObject.StorePagePObj;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.Th;
import org.junit.Assert;

public class AddProductInCartWhenLogOut {

    SignInPageObj storeButton = new SignInPageObj(DriverManager.getDriver()); //obj
    CartPagePObj cartPage = new CartPagePObj(DriverManager.getDriver());
    StorePagePObj addToCart = new StorePagePObj(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @Given("user visit the PearsonAssesment Page")
    public void user_visit_the_PearsonAssesment_Page() {
        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
        DriverManager.getDriver().manage().window().maximize();
    }

    @And("user closes pop-up")
    public void user_closes_popup() {
        storeButton.clickPopUpCloseButton();
    }

    @When("user click on Store button from the header")
    public void user_click_on_Store_button_from_the_header() {
        storeButton.clickStoreButtonHeader();
    }

    @And("click on Sensory Profile Adult Product")
    public void clickOnSensoryProfileAdultProduct() throws InterruptedException {
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        addToCart.clickOnViewCart();
    }

    @Then("the user should see the product in the cart")
    public void theUserShouldSeeTheProductInTheCart() {
        Assert.assertEquals("Adolescent/Adult Sensory Profile", cartPage.getProductNameFromCart());
    }
}
