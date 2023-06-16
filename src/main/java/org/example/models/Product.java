package org.example.models;

/**
 * This class is used for Product Data Structure.
 * When we add a new product to the cart,
 * this class represents the object.
 *
 * @author claudia.madrid
 * */
public class Product {

    private String productName;
    private String productPrice;

    /**
     * This constructor accepts data for the product's name and
     * product's price.
     *
     * @param productName - String value for product's name
     * @param productPrice  -String value for product's price
     * */

    public Product(String productName, String productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    /**
     * This method will return the current value of Product's name
     * @return -String value for current Product's name.*/
    public String getProductName() {
        return productName;
    }
    /**
     * This method will return the current value of Product's price
     * @return -String value for current Product's price.*/
    public String getProductPrice() {
        return productPrice;
    }
    /**
     * This method will return the current object's information
     * @return -String value for current product's object information.*/
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }
}
