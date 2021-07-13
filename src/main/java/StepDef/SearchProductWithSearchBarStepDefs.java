package StepDef;

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

    @Given("user visit the PearsonAssesment page")
    public void userVisitThePearsonAssesmentPage() {
        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
        DriverManager.getDriver().manage().window().maximize();
    }

    @And("user closes Pop-up")
    public void userClosesPopUp() {
        searchBar.clickClosePrivacyPopup2();
        searchBar.clickPopUpCloseButton();
    }

    @When("user click on Search Bar")
    public void userClickOnSearchBar() {
        searchBar.clickOnSearchField();
    }

    @And("type the Ampac produc name")
    public void typeTheAmpacProducName() {
        searchBar.typeSearchFieldInput();
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        searchBar.clickOnSearchButton();
    }

    @Then("the user should see the Ampac's Product Page")
    public void theUserShouldSeeTheAmpacSProductPage() {
        Assert.assertEquals("Activity Measure for Post Acute Care", ampacText.getAmpacTextName());
    }
}
