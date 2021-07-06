import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {


    @Test
    public void unsuccesfulLogIn() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\emma0505\\Desktop\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://www.pearsonassessments.com/store/usassessments/en/login");
        PageObject navigator = new PageObject(webdriver);
        SignInPageObj signIn = new SignInPageObj(webdriver); //obj
        signIn.clickPopUpCloseButton();         //close the Pop-Up
        signIn.clickPrivacyWindow();            //close the Privacy window
        signIn.clickOnUsernameInput();          //Click on Username field
        signIn.typeUsername();
        Thread.sleep(2000);//Type an Username
        navigator.scrollDown();
        signIn.clickPasswordInputField();       //click on Password field
        signIn.typePassword();                  //Type a Password
        signIn.clickSignInButton();             //click SignIn button
        //get Text

        Thread.sleep(2000);//Type an Username
        Assert.assertEquals("Sorry, the credentials you have entered do not match. Please try again.", signIn.getErrorMessageText());
        // Assert.assertTrue("Sorry, the credentials you have entered do not match. Please try again.", signIn.getErrorMessageText());
        webdriver.close();
    }

    @Test
    public void addProductInCartWhenLogOut() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\emma0505\\Desktop\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.pearsonassessments.com/");
        webdriver.manage().window().maximize();

        PageObject navigator = new PageObject(webdriver);

        SignInPageObj storeButton = new SignInPageObj(webdriver); //obj
        storeButton.clickPopUpCloseButton();         //close the Pop-Up
        Thread.sleep(2000);
        //storeButton.clickPrivacyWindow();            //close the Privacy window
        storeButton.clickStoreButtonHeader();

        navigator.scrollDown();
        StorePagePObj addToCart = new StorePagePObj(webdriver);
        Thread.sleep(2000);
        navigator.scrollDown();
        addToCart.clickSensoryProfileAdultProductLink();
        navigator.scrollDown();
        addToCart.clickonKitsFormatCardSpaProduct();

        navigator.scrollDown();
        addToCart.clickOnAddToCartButton();
        Thread.sleep(2000);
        addToCart.clickOnViewCart();

        CartPagePObj cartPage = new CartPagePObj(webdriver);
        navigator.scrollDown();
        Assert.assertEquals("Adolescent/Adult Sensory Profile", cartPage.getProductNameFromCart());
        webdriver.close();

    }

    @Test
    public void addProductFromQuickOrder() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\emma0505\\Desktop\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.pearsonassessments.com/");
        webdriver.manage().window().maximize();

        SignInPageObj storeButton = new SignInPageObj(webdriver); //obj
        storeButton.clickPopUpCloseButton();         //close the Pop-Up
        //   Thread.sleep(2000);
        //   storeButton.clickPrivacyWindow();            //close the Privacy window

        PageObject navigator = new PageObject(webdriver);

        QuickOrderPObj quickOrder = new QuickOrderPObj(webdriver);
        quickOrder.clickOnQuickOrderButton();
        Thread.sleep(2000);
        navigator.scrollDown();
        navigator.scrollDown();

        quickOrder.clickIsbnField();
        quickOrder.typeProductCode();
        quickOrder.clickIsbnPcText();
        Thread.sleep(2000);
        Assert.assertEquals("ABAS-3 Manual", quickOrder.getProductNameAbas());
        webdriver.close();

    }

    @Test
    public void searchProductWithSearchBar() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\emma0505\\Desktop\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.pearsonassessments.com/");
        webdriver.manage().window().maximize();

        SignInPageObj searchBar = new SignInPageObj(webdriver); //obj
        searchBar.clickPopUpCloseButton();         //close the Pop-Up
        searchBar.clickOnSearchField();
        searchBar.typeSearchFieldInput();
        searchBar.clickOnSearchButton();
        StorePagePObj ampacText = new StorePagePObj(webdriver);
        Assert.assertEquals("Activity Measure for Post Acute Care", ampacText.getAmpacTextName());
        webdriver.close();

    }


    @Test
    public void scrollDownandUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\emma0505\\Desktop\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.pearsonassessments.com/");
        webdriver.manage().window().maximize();

        SignInPageObj searchBar = new SignInPageObj(webdriver); //obj
        searchBar.clickPopUpCloseButton();         //close the Pop-Up
        PageObject navigator = new PageObject(webdriver);
        navigator.scrollDown();
        navigator.scrollUp();
        webdriver.close();

    }

    @Test
    public void increaseQuantityInCartMessage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\emma0505\\Desktop\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.pearsonassessments.com/");
        webdriver.manage().window().maximize();

        PageObject navigator = new PageObject(webdriver);
        SignInPageObj storeButton = new SignInPageObj(webdriver); //obj
        CartPagePObj quantityField = new CartPagePObj(webdriver);

        storeButton.clickPopUpCloseButton();         //close the Pop-Up
        Thread.sleep(2000);
        storeButton.clickStoreButtonHeader();

        navigator.scrollDown();
        StorePagePObj addToCart = new StorePagePObj(webdriver);
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

        //navigator.scrollUp();

        CartPagePObj qtyUpdatedMessage = new CartPagePObj(webdriver);
        Assert.assertEquals("Product quantity has been updated.", qtyUpdatedMessage.getQuantityUpdatedMessage());
        webdriver.close();

    }

}
