package StepDef;

import PageObject.PageObject;
import PageObject.SignInPageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PearsonLogoButtonFunctionalityStepDefs {

    SignInPageObject pearsonLogo = new SignInPageObject(DriverManager.getDriver()); //obj
    PageObject navigator = new PageObject(DriverManager.getDriver());

    @When("customer clicks on Search Bar field")
    public void userClickOnSearchBarField() {
        pearsonLogo.clickOnSearchField();
    }

    @And("customer types the Ampac product name")
    public void typeTheAmpacProductName() {
        pearsonLogo.typeSearchFieldInput();
    }

    @And("customer clicks on search button next to the search field")
    public void clickOnSearchButtonNextToTheSearchField() {
        pearsonLogo.clickOnSearchButton();
    }

    @And("customer clicks on Pearson's Logo button")
    public void clickOnPearsonSLogoButton() {
        pearsonLogo.clickOnPearsonLogo();
    }

    @Then("customer should be redirected to the Home Page")
    public void theUserShouldBeRedirectedToTheHomePage() {
        Assert.assertEquals("Pearson Assessments", pearsonLogo.getHomePageTitle());
        navigator.closeBrowser();
    }
}
