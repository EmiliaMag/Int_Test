package StepDef;

import PageObject.QualificationPageObject;
import PageObject.PageObject;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

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
}
