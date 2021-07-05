import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageObj extends PageObject {
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(xpath = "//div[@class = 'nav__right utility-nav--container']//a[@title='Store']")
    private WebElement storeButton;

    @FindBy(id = "site-logo")
    private WebElement pearsonLogo;

    @FindBy(xpath = "//li[@class='active']")
    private WebElement signInBreadcrumb;

    @FindBy(xpath = "//button[@class='search-box-icon']")
    private WebElement searchBarButton;

    @FindBy(xpath = "//div[@class='pearson-banner section']//input[@placeholder='Search']")
    private WebElement searchBarField;

    @FindBy(className = "pull-right forgotten-username")
    private WebElement forgotUsernameAndPasswordButton;

    @FindBy(xpath = "//*[@id='emailID']")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id='acceptTermsOfUseError']/label/input")
    private WebElement termsAgreementsCheckbox;

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 no-padding button-container']//button[@class='button--primary button--block']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//button[@class='pop-up-close']")
    private WebElement popUpCloseButton;

    @FindBy(xpath = "//*[@id='js-cookie-notification']/div/div/div/div/button[2]")
    private WebElement closePrivacyWindow;

    @FindBy(xpath = "//div[@class='form-group current-password']//input[@class='input']")
    private WebElement signInPasswordField;

    @FindBy(xpath = "//button[@class='button--primary button--block']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@class='c-alert__content']//p[@class='c-alert__text']")
    private WebElement unsuccesfulSignInMessage;




    //methods
    public SignInPageObj(WebDriver driver) {
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

    public void typeUsername() {
        usernameInput.sendKeys("username");
    }

    public void clickPrivacyWindow() throws InterruptedException {
        Thread.sleep(2000);
        closePrivacyWindow.click();
    }

    public void clickPasswordInputField() {
        signInPasswordField.click();
    }

    public void typePassword() {
        signInPasswordField.sendKeys("password");
    }

    public void clickSignInButton() {
        signInButton.click();
    }


    public void clickStoreButtonHeader() {
        storeButton.click();
    }

    public void clickOnSearchField() {
        searchBarField.click();
    }
    public void typeSearchFieldInput(){searchBarField.sendKeys("ampac");}
    public void clickOnSearchButton(){searchBarButton.click();}

    public String getErrorMessageText() { return unsuccesfulSignInMessage.getText(); }



}






