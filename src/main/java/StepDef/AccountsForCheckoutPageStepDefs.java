package StepDef;

import PageObject.PageObject;
import Utils.DriverManager;
import Utils.Waits;
import io.cucumber.java.en.And;
import PageObject.AccountsForCheckoutPageObject;

public class AccountsForCheckoutPageStepDefs {


    PageObject navigator = new PageObject(DriverManager.getDriver());
    AccountsForCheckoutPageObject customerAccount = new AccountsForCheckoutPageObject(DriverManager.getDriver());


    @And("customer clicks on My Account Radio Button")
    public void clickOnMyAccountRadioBox() throws InterruptedException {
        Waits.implicitWait();
        customerAccount.clickMyAccountRadioBox();
    }

    @And("customer clicks on Continue button")
    public void clickOnContinueButton() {
        navigator.scrollDown();
        customerAccount.clickContinueButton();
    }

}
