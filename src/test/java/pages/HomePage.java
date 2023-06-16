package pages;



import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
/**
 * This class is used for Home page structure Data.
 *
 * @author claudia.madrid
 * */

public class HomePage{

        private ElementsCollection CARDS_IN_HOMEPAGE;

    /**
     * This method Click the link with the link name received.
     *
     * @param linkName -String is the text name that contains the link.
     * */
    public void clickLink (String linkName){
        $(By.linkText(linkName)).should(visible, Duration.ofSeconds(6)).shouldHave(text(linkName)).click();
    }
    /**
     *This method gets the text of an element that contains
     * the Title of a product.
     *
     * @param n -int is the number of child trying to select.
     * */
    public String getCardTitle(int n){
        return $("#tbodyid > div:nth-child("+ n +") > div > div > h4 > a").text();
    }
    /**
     *This method gets the text of an element that contains
     * the Price of a product.
     *
     * @param n -int is the number of child trying to select.
     * */
    public String getCardPrice(int n){
        return $("#tbodyid > div:nth-child(" + n + ") > div > div > h5").text();
    }
    /**
     *This method gets the collection of products in a Category.
     *
     * @return ElementsCollection on the Homepage by specific Category.
     * */
    public ElementsCollection getCARDS_IN_HOMEPAGE(){
//        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf())
        return CARDS_IN_HOMEPAGE = $$("#tbodyid > div");
    }

}
