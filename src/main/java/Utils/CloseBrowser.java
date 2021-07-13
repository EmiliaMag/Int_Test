package Utils;

public class CloseBrowser {
    public void runAfterEachTest() {
        DriverManager.getDriver().manage().deleteAllCookies();
        DriverManager.getDriver().close();
    }


}
