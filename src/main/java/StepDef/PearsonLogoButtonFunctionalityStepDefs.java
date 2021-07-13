package StepDef;

import PageObject.SignInPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PearsonLogoButtonFunctionalityStepDefs {

    SignInPageObject pearsonLogo = new SignInPageObject(DriverManager.getDriver()); //obj

    @When("user click on Search Bar field")
    public void userClickOnSearchBarField() {
        pearsonLogo.clickOnSearchField();
    }

    @And("type the Ampac product name")
    public void typeTheAmpacProductName() {
        pearsonLogo.typeSearchFieldInput();
    }

    @And("click on search button next to the search field")
    public void clickOnSearchButtonNextToTheSearchField() {
        pearsonLogo.clickOnSearchButton();
    }

    @And("click on Pearson's Logo button")
    public void clickOnPearsonSLogoButton() {
        pearsonLogo.clickOnPearsonLogo();
    }

    @Then("the user should be redirected to the Home Page")
    public void theUserShouldBeRedirectedToTheHomePage() {
        Assert.assertEquals("Pearson Assessments", pearsonLogo.getHomePageTitle());
    }
}
