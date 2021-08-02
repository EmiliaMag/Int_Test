package StepDef;

import PageObject.QualificationPageObject;
import PageObject.PageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class QualificationStepDef {

    QualificationPageObject qualification = new QualificationPageObject(DriverManager.getDriver());
    PageObject navigator = new PageObject(DriverManager.getDriver());


    @Given("^customer visits the PearsonAssessment's Qualification Page$")
    public void customerVisitsPearsonsQualificationPage() {
        DriverManager.getDriver().get("https://www.pearsonassessments.com/store/usassessments/en/my-account/my-qualifications");
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().deleteAllCookies();
    }

    @And("^customer clicks on Edit button on \"(.*)\" section$")
    public void customerClicksOnEditButton(String input) {
        navigator.scrollDown();
        navigator.scrollDown();
        qualification.clickOnEditButton(input);
    }

    @And("customer clicks on Qualification Button from the dropdown list")
    public void customerClicksOnQualificationButtonFromTheDropdownList() {
        qualification.clickOnQualificationButton();
    }

    @Then("customer should be redirected to the Qualification page and should see The B Level Degree")
    public void customerShouldBeRedirectedToTheQualificationPageAndShouldSeeTheBLevelDegree() {
        Assert.assertEquals("Wrong Title or the title is not displayed", "Qualifications", qualification.getQualificationPageTitle());
        Assert.assertEquals("Wrong Qualification Level", "B", qualification.getQualificationLevel());
    }

    @And("customer clicks on Info button on the right of the Qualification Level section")
    public void customerClicksOnInfoButtonOnTheRightOfTheQualificationLevelSection() {
        qualification.clickOnInfoButton();
    }

    @Then("customer should see an Qualification Level Popup")
    public void customerShouldSeeAnQualificationLevelPopup() {
        Assert.assertTrue("Qualification Level", qualification.checkIfXButtonPopupIsDisplayed());
    }

    @And("customer clicks on {string} link")
    public void customerClicksOnLink(String arg0) {
qualification.clickOnViewProductsLink();
    }

    @Then("customer should be redirected to the store page")
    public void customerShouldBeRedirectedToTheStorePage() {
Assert.assertEquals("https://pearsonassessments-stg2.pearson.com/store/usassessments/en/Store/c/store?q=%26%26relevance%26%26qualificationLevel%26%26B", qualification.getStoreURL());
    }
}
