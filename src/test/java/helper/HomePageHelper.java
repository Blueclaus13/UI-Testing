package helper;

import com.codeborne.selenide.WebDriverRunner;
import org.example.models.Product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class contains methods to help the HomePageClass.
 *
 * @author claudia.madrid
 * */
public class HomePageHelper{
    private HomePage homePage = new HomePage();
    private List<Product> productList = new ArrayList<>();

    /**
     * This method select the item by Category and Item's name.
     * It saves in a productList the information of the selected Item.
     * It makes click on the item to go to ProductPage
     *
     * @param item -String This is the name of the Product to select.
     * @param category -String This is the category to find the select product.
     * */
    public void selectingItem(String category, String item){
        homePage.clickLink(category);
        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf($(By.linkText(item))));
        registerSelectingItem(item);
        homePage.clickLink(item);
    }
    /**
     * This method register in the productList the information of the
     * product to select.
     *
     * @param item -String This is the name's product to select.
     * */
    public void registerSelectingItem(String item){
        int sizeOfItemsInPage = homePage.getCARDS_IN_HOMEPAGE().size();
        System.out.println("Size: " + sizeOfItemsInPage);
        for(int i = 0; i < sizeOfItemsInPage; i++) {

            if(item.equals(homePage.getCardTitle(i+1))){
                Product product = new Product(homePage.getCardTitle(i + 1), homePage.getCardPrice(i + 1));
                productList.add(product);
            }

        }

    }
    /**
     * This method gets the productList
     * @return  productList is the List that contains all products selected.
     * */
    public List<Product> getProductList() {
        return productList;
    }
}
