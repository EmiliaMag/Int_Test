import PageObject.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {

    WebDriver webdriver;

    @Before   //inainte de fiecare clasa
    public void setUp() {
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
    }

    @BeforeClass   //inainte de toate clasele
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\emma0505\\Desktop\\chromedriver.exe");
    }

    @Test
    public void succesfulLogIn() throws InterruptedException {
        webdriver.get("https://www.pearsonassessments.com/store/usassessments/en/login");

        PageObject navigator = new PageObject(webdriver);
        SignInPageObj signIn = new SignInPageObj(webdriver); //obj

        signIn.clickPopUpCloseButton();         //close the Pop-Up
        signIn.clickOnUsernameInput();          //Click on Username field
        signIn.typeValidUsername();
        Thread.sleep(2000);//Type an Username
        navigator.scrollDown();
        signIn.clickPasswordInputField();       //click on Password field
        signIn.typeValidPassword();                  //Type a Password
        signIn.clickSignInButton();             //click SignIn button

        Thread.sleep(2000);//Type an Username
        Assert.assertEquals("My Account", signIn.getMyAccountText());
        // Assert.assertTrue("Sorry, the credentials you have entered do not match. Please try again.", signIn.getErrorMessageText());
    }

    @Test
    public void addProductInCartWhenLogOut() throws InterruptedException {
        webdriver.get("https://www.pearsonassessments.com/");

        PageObject navigator = new PageObject(webdriver);
        SignInPageObj storeButton = new SignInPageObj(webdriver); //obj
        CartPagePObj cartPage = new CartPagePObj(webdriver);
        StorePagePObj addToCart = new StorePagePObj(webdriver);

        storeButton.clickPopUpCloseButton();         //close the Pop-Up
        Thread.sleep(2000);
        storeButton.clickStoreButtonHeader();
        navigator.scrollDown();

        Thread.sleep(2000);
        navigator.scrollDown();
        addToCart.clickSensoryProfileAdultProductLink();
        navigator.scrollDown();
        addToCart.clickonKitsFormatCardSpaProduct();
        navigator.scrollDown();
        addToCart.clickOnAddToCartButton();
        Thread.sleep(2000);
        addToCart.clickOnViewCart();
        navigator.scrollDown();

        Assert.assertEquals("Adolescent/Adult Sensory Profile", cartPage.getProductNameFromCart());
    }

    @Test
    public void addProductFromQuickOrder() throws InterruptedException {
        webdriver.get("https://www.pearsonassessments.com/");

        SignInPageObj storeButton = new SignInPageObj(webdriver); //obj
        PageObject navigator = new PageObject(webdriver);
        QuickOrderPObj quickOrder = new QuickOrderPObj(webdriver);

        storeButton.clickPopUpCloseButton();         //close the Pop-Up
        quickOrder.clickOnQuickOrderButton();
        Thread.sleep(2000);
        navigator.scrollDown();
        navigator.scrollDown();
        quickOrder.clickIsbnField();
        quickOrder.typeProductCode();
        quickOrder.clickIsbnPcText();
        Thread.sleep(2000);

        Assert.assertEquals("ABAS-3 Manual", quickOrder.getProductNameAbas());
    }

    @Test
    public void searchProductWithSearchBar() {
        webdriver.get("https://www.pearsonassessments.com/");

        SignInPageObj searchBar = new SignInPageObj(webdriver); //obj
        StorePagePObj ampacText = new StorePagePObj(webdriver);

        searchBar.clickPopUpCloseButton();         //close the Pop-Up
        searchBar.clickOnSearchField();
        searchBar.typeSearchFieldInput();
        searchBar.clickOnSearchButton();

        Assert.assertEquals("Activity Measure for Post Acute Care", ampacText.getAmpacTextName());
    }


    @Test
    public void scrollDownandUp() {
        webdriver.get("https://www.pearsonassessments.com/");

        SignInPageObj searchBar = new SignInPageObj(webdriver); //obj
        PageObject navigator = new PageObject(webdriver);

        searchBar.clickPopUpCloseButton();         //close the Pop-Up
        navigator.scrollDown();
        navigator.scrollUp();
    }

    @Test
    public void increaseQuantityInCartMessage() throws InterruptedException {
        webdriver.get("https://www.pearsonassessments.com/");


        PageObject navigator = new PageObject(webdriver);
        SignInPageObj storeButton = new SignInPageObj(webdriver); //obj
        CartPagePObj quantityField = new CartPagePObj(webdriver);
        StorePagePObj addToCart = new StorePagePObj(webdriver);
        CartPagePObj qtyUpdatedMessage = new CartPagePObj(webdriver);


        storeButton.clickPopUpCloseButton();         //close the Pop-Up
        Thread.sleep(2000);
        storeButton.clickStoreButtonHeader();
        navigator.scrollDown();
        Thread.sleep(2000);
        navigator.scrollDown();

        addToCart.clickSensoryProfileAdultProductLink();
        navigator.scrollDown();
        addToCart.clickonKitsFormatCardSpaProduct();
        navigator.scrollDown();
        addToCart.clickOnAddToCartButton();
        Thread.sleep(2000);
        addToCart.clickOnViewCart();
        navigator.scrollDown();

        quantityField.clickOnQtyField();
        quantityField.deleteTheQtyFieldValue();
        quantityField.typeQtyField();
        quantityField.enterValueTypedQty();

        Assert.assertEquals("Product quantity has been updated.", qtyUpdatedMessage.getQuantityUpdatedMessage());
    }

    @Test
    public void checkNumbersOfItemsWithFilters() throws InterruptedException {
        webdriver.get("https://www.pearsonassessments.com/");

        PageObject navigator = new PageObject(webdriver);
        SignInPageObj signIn = new SignInPageObj(webdriver); //obj
        StorePagePObj storePage = new StorePagePObj(webdriver);


        signIn.clickPopUpCloseButton();         //close the Pop-Up
        Thread.sleep(2000);
        signIn.clickClosePrivacyWindow();
        signIn.clickStoreButtonHeader();

        navigator.scrollDown();
        navigator.scrollDown();

        storePage.clickBehaviorCategoryFilter();
        navigator.scrollDown();
        storePage.clickAgeRangeDropdown();
        navigator.scrollDown();
        storePage.clickPreschoolCheckbox();

        Assert.assertEquals("27 Items found in Store", storePage.getTotalItemsWithFilters());
    }

    @Test
    public void checkPearsonLogo() {
        webdriver.get("https://www.pearsonassessments.com/");

        SignInPageObj pearsonLogo = new SignInPageObj(webdriver); //obj

        pearsonLogo.clickPopUpCloseButton();         //close the Pop-Up
        pearsonLogo.clickOnSearchField();
        pearsonLogo.typeSearchFieldInput();
        pearsonLogo.clickOnSearchButton();
        pearsonLogo.clickOnPearsonLogo();

        Assert.assertEquals("Pearson Assessments", pearsonLogo.getHomePageTitle());
    }

    @Test
    public void saveCartLoggedOutQO() throws InterruptedException {
        webdriver.get("https://www.pearsonassessments.com/");

        SignInPageObj signInPage = new SignInPageObj(webdriver); //obj
        PageObject navigator = new PageObject(webdriver);
        QuickOrderPObj quickOrder = new QuickOrderPObj(webdriver);
        CartPagePObj saveCart = new CartPagePObj(webdriver);

        signInPage.clickPopUpCloseButton();         //close the Pop-Up
        signInPage.clickClosePrivacyWindow();

        quickOrder.clickOnQuickOrderButton();
        Thread.sleep(2000);
        navigator.scrollDown();
        navigator.scrollDown();
        quickOrder.clickIsbnField();
        quickOrder.typeProductCode();
        quickOrder.clickIsbnPcText();
        Thread.sleep(2000);
        navigator.scrollDown();

        quickOrder.clickOnAddToCartButtonQO();
        quickOrder.clickOnViewCartButton();
        navigator.scrollDown();
        saveCart.clickOnSaveCartButton();

        Thread.sleep(3000);
        Assert.assertEquals("Sign in", signInPage.getSignInBreadcrumbText());
    }

    @Test
    public void checkout() throws InterruptedException {
        webdriver.get("https://www.pearsonassessments.com/");

        PageObject navigator = new PageObject(webdriver);
        SignInPageObj signInPage = new SignInPageObj(webdriver); //obj
        CartPagePObj cartPage = new CartPagePObj(webdriver);
        StorePagePObj addToCart = new StorePagePObj(webdriver);
        AccountsForCheckoutPObj customerAccount = new AccountsForCheckoutPObj(webdriver);
        CheckoutPageObj checkoutPage = new CheckoutPageObj(webdriver);

        signInPage.clickPopUpCloseButton();
        signInPage.clickClosePrivacyWindow();
        signInPage.clickSigninRegisterHeaderButton();
        signInPage.clickOnUsernameInput();
        navigator.scrollDown();
        signInPage.typeValidUsername();
        signInPage.clickPasswordInputField();
        navigator.scrollDown();
        signInPage.typeValidPassword();
        signInPage.clickSignInButton();
        Thread.sleep(2000);
        signInPage.clickStoreButtonHeader();
        navigator.scrollDown();

        Thread.sleep(2000);
        navigator.scrollDown();
        addToCart.clickSensoryProfileAdultProductLink();
        addToCart.clickNoSurveyPopup();
        navigator.scrollDown();
        addToCart.clickonKitsFormatCardSpaProduct();
        navigator.scrollDown();
        addToCart.clickOnAddToCartButton();
        Thread.sleep(2000);
        addToCart.clickOnViewCart();
        navigator.scrollDown();
        navigator.scrollDown();

        cartPage.clickOnCheckoutButton();
        Thread.sleep(3000);
        navigator.scrollDown();
        customerAccount.clickMyAccountRadioBox();
        navigator.scrollDown();
        customerAccount.clickContinueButton();


        Assert.assertEquals("Secure checkout", checkoutPage.getSecureCheckoutTitleText());
    }


    @After    //dupa fiecare clasa
    public void runAfterEachTest() {
        webdriver.manage().deleteAllCookies();
        webdriver.close();
    }
}
