package helper;

import org.openqa.selenium.Alert;
import pages.ProductPage;

import static com.codeborne.selenide.Selenide.switchTo;
/**
 * This class contains methods to help the ProductPage Class.
 *
 * @author claudia.madrid
 * */
public class ProductPageHelper {
    private ProductPage productPage = new ProductPage();

    /**
     * This a method to Click Add to Cart button and
     * add the product to the Cart.
     * Finally, it clicks the link for a CartPage
     *
     * @return -String this is the text message received after adding the
     * product to the Cart.
     * */
    public String addingItemToCart(){
        productPage.clickLink("Add to cart");
        Alert alert = switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;

    }



}
