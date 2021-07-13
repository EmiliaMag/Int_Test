package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import PageObject.QuickOrderPageObject;
import PageObject.CartPagePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SaveCartWhenLoggedOutStepDefs {

    SignInPageObject signInPage = new SignInPageObject(DriverManager.getDriver()); //obj
    PageObject navigator = new PageObject(DriverManager.getDriver());
    QuickOrderPageObject quickOrder = new QuickOrderPageObject(DriverManager.getDriver());
    CartPagePageObject saveCart = new CartPagePageObject(DriverManager.getDriver());

    @When("customer clicks on Quick Order button from the Pearson Banner")
    public void userClickOnQuickOrderButtonFromThePearsonBanner() {
        quickOrder.clickOnQuickOrderButton();
    }

    @And("customer clicks on add to Cart button on the right side of the Product Code field")
    public void clickOnAddToCartButtonOnTheRightSideOfTheProductCodeField() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();
        quickOrder.clickOnAddToCartButtonTop();
    }


    @And("customer clicks on Save cart button on the pop-up")
    public void clickOnSaveCartButtonOnThePopUp() throws InterruptedException {
        navigator.implicitWait();
        navigator.scrollDown();
        navigator.scrollDown();
        saveCart.clickOnSaveCartButton();
    }

    @Then("customer should see the Sign In page in breadcrumb")
    public void theUserShouldShouldBeRedirectedAndShouldSeeTheSignInPageInBreadcrumb() {
        navigator.implicitWait();
        Assert.assertEquals("Sign in", signInPage.getSignInBreadcrumbText());
        navigator.closeBrowser();
    }
}
