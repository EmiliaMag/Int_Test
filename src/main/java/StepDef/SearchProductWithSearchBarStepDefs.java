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

public class SearchProductWithSearchBarStepDefs {

    SignInPageObject searchBar = new SignInPageObject(DriverManager.getDriver()); //obj
    StorePagePageObject ampacText = new StorePagePageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @When("customer clicks on Search Bar")
    public void userClickOnSearchBar() {
        searchBar.clickOnSearchField();
    }

    @And("customer types the Ampac produc name")
    public void typeTheAmpacProducName() {
        searchBar.typeSearchFieldInput();
    }

    @And("customer clicks on search button")
    public void clickOnSearchButton() {
        searchBar.clickOnSearchButton();
    }

    @Then("customer should see the Ampac's Product Page")
    public void theUserShouldSeeTheAmpacSProductPage() {
        Assert.assertEquals( "The title is incorrect","Activity Measure for Post Acute Care", ampacText.getAmpacTextName());
        navigator.closeBrowser();
    }
}
