package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import org.example.models.Product;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
/**
 * This class is used for Product page structure Data.
 *
 * @author claudia.madrid
 * */
public class ProductPage {

    /**
     * This method Click the link with the link name received.
     *
     * @param linkName -String is the text name that contains the link.
     * */
    public void clickLink (String linkName){
        $(By.linkText(linkName)).should(visible, Duration.ofSeconds(4)).click();
    }
    public void clickHome(){
        $("#navbarExample > ul > li.nav-item.active > a").should(visible).click();
    }

}
