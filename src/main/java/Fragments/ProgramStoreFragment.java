package Fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProgramStoreFragment {

    @FindBy(xpath = ".//a[@class='product__list--name']")    //element din fragment
    public WebElement title;

    @FindBy(xpath = ".//div[@class='product__listing--description']")   //element din fragment
    public WebElement description;


    public WebElement getTitle() {
        return title;
    }

    public WebElement getDescription() {
        return description;
    }

    public void click() {
        title.click();
    }

}


//    @FindBy(xpath = "locator")
//    private List<ProgramList> nameFragmentList;
//
//    @FindBy(xpath = ".//div[@class='col-sm-12 col-md-9']")
//    private WebElement nameFragmentSection;
//
//    public void waitUntilNameFragmentSectionIsDisplayed(){
//        nameFragmentSection.wait;
//    }
//
//    private NameFragment getNameFragmentByName(String uniqueName) {
//        return nameFragmentList.stream()
//                .filter(item -> item.getNameFragment().equals(uniqueName))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Unable to find a nameFragment with uniqueName: " + uniqueName));
//    }
//    public void clickOnNameFragmentWithName(String name){
//        getNameFragmentByName(name).clickOnName();
//    }
//}
////    @FindBy(xpath = ".//a[@class='c-paging__btn prev']") Punctul inainte de "//" reprezinta cautarea in elementul declarata la nivelul clasei
////}
