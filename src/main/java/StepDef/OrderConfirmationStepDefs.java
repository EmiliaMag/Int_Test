package StepDef;

import PageObject.CartPagePageObject;
import PageObject.PageObject;
import PageObject.OrderConfirmationPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;

public class OrderConfirmationStepDefs {

    OrderConfirmationPageObject orderConf = new OrderConfirmationPageObject(DriverManager.getDriver());

        @Then("^customer should see the Order Confirmation Page with an Thank You Message$")
    public void customerShouldSeeTheOrderConfirmationPage(){
            Assert.assertEquals("The titles don't match","Order confirmation",orderConf.getOrderConfirmationPageTitle());
            Assert.assertEquals("The messages are not identical","Thank you for your order",orderConf.getThankYouConfirmationMessage());
        }

}
