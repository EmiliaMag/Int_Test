package PageObject;

import Utils.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageObject extends PageObject {

    @FindBy(xpath = "//input[@id = 'username']")
    private WebElement usernameFieldSignIn;

    @FindBy(xpath = "//div[@class = 'nav__right utility-nav--container']//a[@title='Store']")
    private WebElement storeButton;

    @FindBy(xpath = "//img[@src='/content/dam/global-store/global/images/ui/logos/pearson-logo.svg']")
    private WebElement pearsonLogo;

    @FindBy(xpath = "//button[@class='search-box-icon']")
    private WebElement searchBarButton;

    @FindBy(xpath = "//input[@class='search-box-input ui-autocomplete-input']")
    private WebElement searchBarField;

    @FindBy(xpath = "//input[@class='search-box-input ui-autocomplete-input']")
    private WebElement searchBarFieldNew;

    @FindBy(className = "pull-right forgotten-username")
    private WebElement forgotUsernameAndPasswordButton;

    @FindBy(xpath = "//*[@id='acceptTermsOfUseError']/label/input")
    private WebElement termsAgreementsCheckbox;

    @FindBy(xpath = "//button[@class='pop-up-close']")
    private WebElement popUpCloseButton;

    @FindBy(xpath = "//a[@class='js--pearson-cookie-policy-accept-continue button-ghost--on-dark']")
    private WebElement closePrivacyWindow;

    @FindBy(xpath = "//div[@class='form-group current-password']//input[@class='input']")
    private WebElement signInPasswordField;

    @FindBy(xpath = "//button[@class='button--primary button--block']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@class='c-alert__content']//p[@class='c-alert__text']")
    private WebElement unsuccesfulSignInMessage;

    @FindBy(xpath = "//span[@class='hero-carousel-user-data sans']")
    private WebElement homePageTitle;

    @FindBy(xpath = "//ol[@class='c-breadcrumb__list show-children--all']//li[@class='active']")
    private WebElement signInBreadcrumb;

    @FindBy(xpath = "//li[@class='login-wrapper']")
    private WebElement signInRegisterHeaderButton;

    @FindBy(xpath = "//a[@class='userNav__button jsUserNotSignedInIdentifier']")
    private WebElement signInRegisterButtonNew;

    @FindBy(xpath = "//button[@class='js-context-switcher']")
    private WebElement myAccountHeaderButton;

    @FindBy(xpath = "//button[@class='userNav__button jsUserSignedInIdentifier']")
    private WebElement myAccountButtonNew;

    @FindBy(xpath = "//button[@class='button-ghost--on-dark button--primary hasArrow arrowRight js-cookie-notification-accept']")
    private WebElement closePrivacyWindow2;

    @FindBy(xpath = "//a[@href='/store/usassessments/en/logout']")
    private WebElement signOutButton;

    @FindBy(xpath = "//a[@href='/store/usassessments/en/addresses']")
    private WebElement addressBookButton;

    @FindBy(xpath = "//li[1]//a[@title='Saved Carts']")
    private WebElement saveCartsLink;

    @FindBy(xpath = "//a[@href='/store/usassessments/en/my-account/my-quotes']")
    private WebElement quotesButton;

    //Create Account

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='emailID']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='userID']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='passwordID']")
    private WebElement passwordFieldCreateAccount;

    @FindBy(xpath = "//input[@id='same_as_email_address_registration']")
    private WebElement sameAsEmailCheckbox;

    @FindBy(xpath = "//input[@id='acceptTermsOfUse']")
    private WebElement termsAndConditionsCheckbox;

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 no-padding button-container']//button[@class='button--primary button--block']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//span[@id='emailID-error']")
    private WebElement emailErrorMessage;

    @FindBy(xpath = "//div[@class='primary-controls']")
    private WebElement capchaElement;

    //methods
    public SignInPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickPopUpCloseButton() {
        popUpCloseButton.click();
    }

    public void clickOnUsernameInput() {
        usernameFieldSignIn.click();
    }

    public void typeValidUsernameSignIn() {
        usernameFieldSignIn.sendKeys("emiliamag");
    }

    public void clickClosePrivacyWindow() {
        closePrivacyWindow.click();
    }

    public void clickPasswordInputField() {
        signInPasswordField.click();
    }

    public void typeValidPassword() {
        signInPasswordField.sendKeys("Adem590@");
    }

    public void clickSignInButton() {
        Waits.waitUntilElementIsDisplayed(signInButton);
        signInButton.click();
    }

    public void clickStoreButtonHeader() {
        storeButton.click();
    }

    public void clickOnSearchField() {
        searchBarFieldNew.click();
    }

    public void typeSearchFieldInput() {
        searchBarFieldNew.sendKeys("ampac");
    }

    public void clickOnSearchButton() {
        searchBarButton.click();
    }

    public String getErrorMessageText() {
        return unsuccesfulSignInMessage.getText();
    }

    public void clickOnPearsonLogo() {
        pearsonLogo.click();
    }

    public String getHomePageTitle() {
        return homePageTitle.getText();
    }

    public String getSignInBreadcrumbText() {
        return signInBreadcrumb.getText();
    }

    public void clickSigninRegisterHeaderButton() {
        signInRegisterButtonNew.click();
    }

    public String getMyAccountText() {
        //return myAccountHeaderButton.getText();
        return myAccountButtonNew.getText();
    }

    public void clickClosePrivacyPopup2() {
        closePrivacyWindow2.click();
    }

    public void clickMyAccountDropdownButton() {
        // myAccountHeaderButton.click();
        clickWithJS(myAccountButtonNew);
    }

    public void clickOnSignOutButton() {
        Waits.waitUntilElementIsDisplayed(signOutButton);
        signOutButton.click();
    }

    public void clickOnAddressBook() {
        Waits.waitUntilPageIsLoaded(driver, 20);
        addressBookButton.click();
    }

    public void clickOnSaveCartsLink() {
        saveCartsLink.click();
    }

    public String getSignInText() {
        return signInRegisterButtonNew.getText();
    }

    public void clickOnQuotesButton() {
        quotesButton.click();
    }

    //methods for Create Account Form
    public void clickAndTypeFirstNameField(String input) {
        firstNameField.click();
        firstNameField.sendKeys(input);
    }

    public void clickAndTypeLastNameField(String input) {
        lastNameField.click();
        lastNameField.sendKeys(input);
    }

    public void clickAndTypeEmailField(String input) {
        emailField.click();
        emailField.sendKeys(input);
    }

    public void uncheckSameAsEmailCheckbox() {
        clickWithJS(sameAsEmailCheckbox);
//        sameAsEmailCheckbox.click();
    }

    public void clickAndTypeUsernameFieldCreateAccount(String input) {
        usernameField.click();
        usernameField.sendKeys(input);
    }

    public void clickAndTypePasswordField(String input) {
        passwordFieldCreateAccount.click();
        passwordFieldCreateAccount.sendKeys(input);
    }

    public void checkTermsAndConditionsCheckbox() {
        clickWithJS(termsAgreementsCheckbox);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public String getEmailErrorMessage() {
        return emailErrorMessage.getText();
    }

    public Boolean isSignInButtonDisplayed() {
        return signInRegisterButtonNew.isDisplayed();
    }

    public Boolean isCapchaElementDisplayed() {
        return capchaElement.isDisplayed();   //isPresent
    }
}






