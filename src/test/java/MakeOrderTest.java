import helper.Base;
import helper.CartPageHelper;
import helper.HomePageHelper;
import helper.ProductPageHelper;
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

  /** This method to test the process of generate a successful order. */
  @Test
  public void test() {
    // Selecting the product.
    homePageHelper.selectingItem("Laptops", "MacBook Pro");

    // Adding the product to the Cart.
    String responseLaptop = productPageHelper.addingItemToCart();
    // Validation of the response.
    Assert.assertEquals(responseLaptop, "Product added");

    productPage.clickHome();
    homePageHelper.selectingItem("Phones", "Nexus 6");

    // Adding the product to the Cart.
    String responsePhone = productPageHelper.addingItemToCart();
    // Validation of the response.
    Assert.assertEquals(responsePhone, "Product added");
    productPage.clickLink("Cart");

    // Validation of the sum of prices with the Total cost.
    Assert.assertTrue(cartPageHelper.isEqualTotal(cartPageHelper.sumPrices()));

    // Receiving the generated Order and form.
    Order order = cartPageHelper.placeOrder();
    Form formMade = cartPageHelper.getForm();

    // Receiving the message after filling in the form.
    String messageReceived = cartPageHelper.getForm().getMessageReceived();

    // Validating the (Form data) is equal to (generated Order)
    Assert.assertEquals(messageReceived, "Thank you for your purchase!");
    Assert.assertEquals(order.getName(), formMade.getName());
    Assert.assertEquals(order.getCreditCarNumber(), formMade.getCreditCard());
    Assert.assertEquals(order.getTotal(), formMade.getTotal());
  }
}
