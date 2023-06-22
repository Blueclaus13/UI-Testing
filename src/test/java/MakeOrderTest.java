import helper.*;
import org.example.helpers.Categories;
import org.example.helpers.Laptops;
import org.example.helpers.Phones;
import org.example.models.Form;
import org.example.models.Order;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

/**
 * This class is used for test the process of generate an Order.
 *
 * @author claudia.madrid
 */
public class MakeOrderTest extends Base {
  private HomePageHelper homePageHelper = new HomePageHelper();
  private ProductPageHelper productPageHelper = new ProductPageHelper();
  private ProductPage productPage = new ProductPage();
  private CartPageHelper cartPageHelper = new CartPageHelper();
  private Constants constants = new Constants();

  /** This method to test the process of generate a successful order. */
  @Test
  public void test() {
    // Selecting the product.
    homePageHelper.selectingItem(Categories.Laptops.name(), Laptops.MacBookPro.label);

    // Adding the product to the Cart.
    String responseLaptop = productPageHelper.addingItemToCart();
    // Validation of the response.
    Assert.assertEquals(responseLaptop, constants.PRODUCT_ADDED);

    productPage.clickHome();
    homePageHelper.selectingItem(Categories.Phones.name(), Phones.Nexus_6.label);

    // Adding the product to the Cart.
    String responsePhone = productPageHelper.addingItemToCart();
    // Validation of the response.
    Assert.assertEquals(responsePhone, constants.PRODUCT_ADDED);
    productPage.clickLink(constants.CART_LINK_NAME);

    // Validation of the sum of prices with the Total cost.
    Assert.assertTrue(cartPageHelper.isEqualTotal(cartPageHelper.sumPrices()));

    // Receiving the generated Order and form.
    Order order = cartPageHelper.placeOrder();
    Form formMade = cartPageHelper.getForm();

    // Receiving the message after filling in the form.
    String messageReceived = cartPageHelper.getForm().getMessageReceived();

    // Validating the (Form data) is equal to (generated Order)
    Assert.assertEquals(messageReceived, constants.ORDER_MNS);
    Assert.assertEquals(order.getName(), formMade.getName());
    Assert.assertEquals(order.getCreditCarNumber(), formMade.getCreditCard());
    Assert.assertEquals(order.getTotal(), formMade.getTotal());
  }
  @Test
  public void test2(){
    System.out.println("Hello word");
  }
}
