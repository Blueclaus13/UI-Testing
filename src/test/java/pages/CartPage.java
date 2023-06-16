package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.example.models.Form;
import org.example.models.Product;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

/**
 * This class is used for Cart page structure Data.
 *
 * @author claudia.madrid
 * */
public class CartPage {

    private ElementsCollection CART_ITEMS;
    private final SelenideElement ORDER_CONFIRMATION_INFO = $("body > div.sweet-alert.showSweetAlert.visible > p");
    private final SelenideElement TOTAL = $("#totalp");
    private final SelenideElement ORDER_MESSAGE = $("body > div.sweet-alert.showSweetAlert.visible > h2");
    private final SelenideElement INPUT_NAME = $("#name");
    private final SelenideElement INPUT_COUNTRY = $("#country");
    private final SelenideElement INPUT_CITY = $("#city");
    private final SelenideElement INPUT_CREDIT_CARD = $("#card");
    private final SelenideElement INPUT_MONTH = $("#month");
    private final SelenideElement INPUT_YEAR = $("#year");
    private final SelenideElement BTN_PLACE_ORDER = $("#page-wrapper > div > div.col-lg-1 > button");
    private final SelenideElement BTN_CLOSE_MODAL = $("#orderModal > div > div > div.modal-footer > button.btn.btn-secondary");
    private final SelenideElement BTN_PURCHASE =$("#orderModal > div > div > div.modal-footer > button.btn.btn-primary");
    private final SelenideElement BTN_OK = $("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");

    private List<Product> productList = new ArrayList<>();
    private Form form;

    /**
     * This method register in the productList the information of the
     * products contained in the Cart.
     * If the list is empty, it loops in the cart Items to fill the list.
     *
     * @return productList This is the list of products contained in the Cart.
     * */
    public List<Product> getProductList(){
        System.out.println("Size Cart: "+ getCART_ITEMS().size());

        if(productList.size() == 0){
            for (int i = 0; i < getCART_ITEMS().size() ; i++){
                productList.add(new Product(getItemNameByIndex(i + 1),getItemPriceByIndex(i + 1) ));
            }
        }
        return productList;
    }
    /**
     *This method gets the Elements collection of products in the
     * cart.
     *
     * @return -ElementsCollection this is the elements contained in the Cart.
     * */
    public ElementsCollection getCART_ITEMS() {
        sleep(2000);
        CART_ITEMS = $$(".success");
        return CART_ITEMS;
    }

    /**
     *This method gets the text of an element that contains
     * the Name of a product.
     *
     * @param index -int is the number of child trying to select.
     * */
    public String getItemNameByIndex(int index){
        return $("#tbodyid > tr:nth-child(" + index + ") > td:nth-child(2)").text();
    }
    /**
     *This method gets the text of an element that contains
     * the Price of a product.
     *
     * @param index -int is the number of child trying to select.
     * */
    public String getItemPriceByIndex(int index){
        return $("#tbodyid > tr:nth-child(" + index + ") > td:nth-child(3)").text();
    }
    /**
     *This method gets the text of an element that contains
     * the total cost in the Cart.
     *
     * @return -String This is the total cost of products in the Cart.
     * */
    public String getTOTAL() {
        return TOTAL.text();
    }
      /**
       *This method gets the text of an element that contains
       * The message received after submitting the form.
       *
       * @return -String This is the message received after submitting the form.
       * */
    public String getOrderMessage() {
        return ORDER_MESSAGE.text();
    }
    /**
     *This method Click Button Place Order.
     * */
    public void clickPlaceOrder(){
        BTN_PLACE_ORDER.click();
    }
    /**
     *This method Click Button Purchase on the form.
     * */
    public void clickPurchase(){
        BTN_PURCHASE.click();
    }
    /**
     *This method Click Button close modal's Form.
     * */
    public void clickCloseModal(){
        BTN_CLOSE_MODAL.click();
    }
    /**
     *This method Click Button Ok on the message after placing the order.
     * */
    public void clickOK(){
        BTN_OK.click();
    }
    /**
     *This method Fill in the name in the input Name.
     * @param name -String this is the user's name.
     * */
    public void fillInName(String name){
        INPUT_NAME.val(name);
    }
    /**
     *This method Fill in the name in the input Country.
     * @param country -String this is the user's country.
     * */
    public void fillInCountry(String country){
        INPUT_COUNTRY.val(country);
    }
    /**
     *This method Fill in the name in the input City.
     * @param city -String this is the user's city.
     * */
    public void fillInCity(String city){
        INPUT_CITY.val(city);
    }
    /**
     *This method Fill in the name in the input creditCart.
     * @param creditCard -String this is the user's creditCard number.
     * */
    public void fillInCreditCard(String creditCard){
        INPUT_CREDIT_CARD.val(creditCard);
    }
    /**
     *This method Fill in the name in the input Month.
     * @param month -String this is the credit-card expire month.
     * */
    public void fillInMonth(String month){
        INPUT_MONTH.val(month);
    }
    /**
     *This method Fill in the name in the input Year.
     * @param year -String this is the credit-card expire year.
     * */
    public void fillInYear(String year){
        INPUT_YEAR.val(year);
    }
    /**
     *This method gets Order's information data.
     * @return -String this is the order information data to make an Order instance.
     * */
    public String getORDER_CONFIRMATION_INFO(){
        return ORDER_CONFIRMATION_INFO.text();
    }
    /**
     *This method to make a Form instance.
     * @return -Form instance born.
     * */
    public Form makeNewOrder(String name, String country, String city, String creditCard, String month, String year, int total){
        return new Form(name, country, city, creditCard, month, year, total);
    }
}
