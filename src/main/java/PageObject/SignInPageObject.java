package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageObject extends PageObject {

    @FindBy(xpath = "//input[@id = 'username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//div[@class = 'nav__right utility-nav--container']//a[@title='Store']")
    private WebElement storeButton;

    @FindBy(xpath = "//div[@id = 'site-logo']")
    private WebElement pearsonLogo;

    @FindBy(xpath = "//button[@class='search-box-icon']")
    private WebElement searchBarButton;

    @FindBy(xpath = "//div[@class='pearson-banner section']//input[@placeholder='Search']")
    private WebElement searchBarField;

    @FindBy(className = "pull-right forgotten-username")
    private WebElement forgotUsernameAndPasswordButton;

    @FindBy(xpath = "//input[@id='emailID']")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id='acceptTermsOfUseError']/label/input")
    private WebElement termsAgreementsCheckbox;

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 no-padding button-container']//button[@class='button--primary button--block']")
    private WebElement createAccountButton;

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

    @FindBy(xpath = "//button[@class='js-context-switcher']")
    private WebElement myAccountHeaderButton;

    @FindBy(xpath = "//button[@class='button-ghost--on-dark button--primary hasArrow arrowRight js-cookie-notification-accept']")
    private WebElement closePrivacyWindow2;

    @FindBy(xpath = "//div[@class='context-menu-section sign-out']")
    private WebElement signOutButton;

    //methods
    public SignInPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickOnEmailField() {
        emailInput.click();
    }

    public void clickPopUpCloseButton() {
        popUpCloseButton.click();
    }

    public void clickOnUsernameInput() {
        usernameInput.click();
    }

    public void typeValidUsername() {
        usernameInput.sendKeys("emiliamag");
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
        waitUntilElementIsDisplayed(signInButton);
        signInButton.click();
    }

    public void clickStoreButtonHeader() {
        storeButton.click();
    }

    public void clickOnSearchField() {
        searchBarField.click();
    }

    public void typeSearchFieldInput() {
        searchBarField.sendKeys("ampac");
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
        signInRegisterHeaderButton.click();
    }

    public String getMyAccountText() {
        return myAccountHeaderButton.getText();
    }

    public void clickClosePrivacyPopup2() {
        closePrivacyWindow2.click();
    }

    public void clickMyAccountDropdownButton() {
        myAccountHeaderButton.click();
    }

    public void clickOnSignOutButton() {
        waitUntilElementIsDisplayed(signOutButton);
        signOutButton.click();
    }

}






