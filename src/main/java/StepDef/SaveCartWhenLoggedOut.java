package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObj;
import PageObject.QuickOrderPObj;
import PageObject.CartPagePObj;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.Th;
import org.junit.Assert;

public class SaveCartWhenLoggedOut {

    SignInPageObj signInPage = new SignInPageObj(DriverManager.getDriver()); //obj
    PageObject navigator = new PageObject(DriverManager.getDriver());
    QuickOrderPObj quickOrder = new QuickOrderPObj(DriverManager.getDriver());
    CartPagePObj saveCart = new CartPagePObj(DriverManager.getDriver());

    @When("user click on Quick Order button from the Pearson Banner")
    public void userClickOnQuickOrderButtonFromThePearsonBanner() {
        quickOrder.clickOnQuickOrderButton();
    }

    @And("click on Add to Cart button on the right side of the Product Code field")
    public void clickOnAddToCartButtonOnTheRightSideOfTheProductCodeField() throws InterruptedException {
        Thread.sleep(2000);
        navigator.scrollDown();
        quickOrder.clickOnAddToCartButtonQO();
    }

    @When("user click on View Cart button from the Add to cart pop-up")
    public void userClickOnViewCartButtonFromTheAddToCartPopUp() {
        quickOrder.clickOnViewCartButton();
    }

    @And("click on Save cart button on the pop-up")
    public void clickOnSaveCartButtonOnThePopUp() throws InterruptedException {
        Thread.sleep(2000);
        navigator.scrollDown();
        navigator.scrollDown();
        saveCart.clickOnSaveCartButton();
    }

    @Then("the user should should be redirected and should see the Sign In page in breadcrumb")
    public void theUserShouldShouldBeRedirectedAndShouldSeeTheSignInPageInBreadcrumb() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Sign in", signInPage.getSignInBreadcrumbText());
    }
}
