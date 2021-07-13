package StepDef;
import PageObject.CartPagePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.Then;

public class AddToCartFromStoreAndQuickOrderStepDefs {
    CartPagePageObject cartPage = new CartPagePageObject(DriverManager.getDriver());


        @Then("user should see the Cart page with the product selected")
    public  void userSeeProductInCart() {
 cartPage.getSensoryProfileProductTitle();
    }

    }

