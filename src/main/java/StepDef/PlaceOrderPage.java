package StepDef;

import PageObject.PageObject;
import PageObject.PlaceOrderTestStepDefs;
import Utils.DriverManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PlaceOrderPage {


    PlaceOrderTestStepDefs placeOrderPage = new PlaceOrderTestStepDefs(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @Then("customer should see the Secure Checkout Page")
    public void userShouldSeeTheSecureCheckooutPage() {
        Assert.assertEquals("Unexpected title on Secure Checkout Page", "Secure checkout", placeOrderPage.getSecureCheckoutTitleText());
//        navigator.closeBrowser();
    }

}
