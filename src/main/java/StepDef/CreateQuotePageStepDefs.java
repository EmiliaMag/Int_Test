package StepDef;

import PageObject.CreateQuotePageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateQuotePageStepDefs {

    CreateQuotePageObject createquote = new CreateQuotePageObject(DriverManager.getDriver());

    @Then("customer should see the Shipping Method section from the Create Quote form")
    public void customerShouldSeeTheShippingMethodSectionFromCQ() {
       Assert.assertEquals("The texts don't match","Shipping method",createquote.getShippingMethodCQTitle());
    }

    @And("customer accepts the Terms and Conditions by clicking on the checkbox")
    public void customerAcceptsTermsCQ() {
        createquote.checkTermsAndConditionsCheckbox();
    }

    @And("customer clicks on Generate Quote button")
    public void customerClickOnGenerateQuoteButton() {
        createquote.clickGenerateQuote();
    }

    @And("customer clicks on View Quote on the Quote Created Popup")
    public void customerClicksOnViewQuoteOnTheQuoteCreatedPopup() {
        createquote.clickViewQuoteButtonPopup();
    }

    @Then("the customer should see the created quote")
    public void theCustomerShouldSeeTheCreatedQuote() {
        Assert.assertTrue("The element is not displayed", createquote.ifQuoteElentIsDisplayed());
    }
}
