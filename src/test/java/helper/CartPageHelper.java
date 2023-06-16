package helper;

import org.example.models.Form;
import org.example.models.Order;
import org.example.models.Product;
import pages.CartPage;
/**
 * This class contains methods to help the CartPageClass.
 *
 * @author claudia.madrid
 * */
public class CartPageHelper {
    private CartPage cartPage = new CartPage();
    private Form form;

    /**
     * This method Sum all prices of products in the Cart.
     *
     * @return -int this is the sum of products in the Cart.
     * */
    public int sumPrices(){
        int sum = 0;
        for (Product product : cartPage.getProductList() ) {
            sum += Integer.parseInt(product.getProductPrice());
            System.out.println(product);
        }
        return sum;
     }
    /**
     * This method check if the sum and Total element are the same value.
     * @param sum -int Value of sum of all products.
     * @return -Boolean this is the result of a comparison.
     * */
     public Boolean isEqualTotal(int sum){
         System.out.println("Sum: " + sum);
         System.out.println("Total: " + cartPage.getTOTAL());
         return sum == Integer.parseInt(cartPage.getTOTAL());
     }
    /**
     * This method clicks the Place Order button in
     * the cart to start the process of generating an Order.
     *
     * @return -Order this is the instance of a generated order.
     * */
     public Order placeOrder(){
        cartPage.clickPlaceOrder();
        fillInForm();
        cartPage.clickPurchase();
        getForm().setMessageReceived(cartPage.getOrderMessage());
        Order order = getOrder(cartPage.getORDER_CONFIRMATION_INFO());
        cartPage.clickOK();
        return order;

     }
  /**
   * This method transforms the text of an order generated on the
   * CartPage to make it an instance of Order.
   *
   * @return -Order this is the instance of a generated order.
   * */
  public Order getOrder(String orderConfirmation) {
        String[] orderParts = orderConfirmation.split("\n");
        String id = orderParts[0].substring(4);
        String amount = orderParts[1].substring(orderParts[1].indexOf(" ") + 1, orderParts[1].indexOf("U") - 1);
        String cardNumber = orderParts[2].substring(13);
        String name = orderParts[3].substring(6);
        String date = orderParts[4].substring(6);

        Order order = new Order(Long.parseLong(id), Integer.parseInt(amount), cardNumber, name,date);
        System.out.println(order);
        return order;
     }

    /**
     * This method fill in the form of the User's data to buy the products
     * in the Cart.
     * It saves the form data in the form field of this helper page.
     *
     * */
     public void fillInForm(){
         this.form =  cartPage.makeNewOrder("Claudia", "Mexico",
                 "Chihuahua", "1234567891011121", "01", "1995" , Integer.parseInt(cartPage.getTOTAL()));
         cartPage.fillInName(form.getName());
         cartPage.fillInCountry(form.getCountry());
         cartPage.fillInCity(form.getCity());
         cartPage.fillInCreditCard(form.getCreditCard());
         cartPage.fillInMonth(form.getMonth());
         cartPage.fillInYear(form.getYear());
     }
    /**
     * This method will get the current value of Form made
     * @return -Form instance of the Form made.*/
    public Form getForm() {
        return form;
    }

    /**
     * This method will set value of form made
     * to the value passed in.
     *
     * @param form-Form value for current form Made.*/
    public void setForm(Form form) {
        this.form = form;
    }
}
