package helper;

import org.example.models.Product;

import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

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
        //registerSelectingItem(item);
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
