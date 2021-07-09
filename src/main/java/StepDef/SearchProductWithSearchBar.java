package StepDef;

import PageObject.SignInPageObj;
import PageObject.StorePagePObj;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchProductWithSearchBar {

    SignInPageObj searchBar = new SignInPageObj(DriverManager.getDriver()); //obj
    StorePagePObj ampacText = new StorePagePObj(DriverManager.getDriver());

    @Given("user visit the PearsonAssesment page")
    public void userVisitThePearsonAssesmentPage() {
        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/login");
        DriverManager.getDriver().manage().window().maximize();
    }

    @And("user closes Pop-up")
    public void userClosesPopUp() {
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
