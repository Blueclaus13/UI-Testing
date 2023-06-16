package org.example.models;

/**
 * This class is used for Order Data Structure.
 * When we make a successful purchase we receive the Order information
 * to fill in the order fields.
 *
 * @author claudia.madrid
 * */
public class Order {

    private long id;
    private int total;
    private String creditCarNumber;
    private String name;
    private String date;

    /**
     * This constructor accepts data for the product's name and
     * product's price.
     *
     * @param id  -int value for Orders's Id
     * @param name - String value for Order's Name
     * @param date   -String value for Orders's Date
     * @param total -int value for Orders's Total
     * @param creditCarNumber -String value for Orders's Credit card number

     * */
    public Order(long id, int total, String creditCarNumber, String name, String date) {
        this.id = id;
        this.total = total;
        this.creditCarNumber = creditCarNumber;
        this.name = name;
        this.date = date;
    }

    /**
     * This method will return the current value of Order's id
     * @return -String value for current Order's id.*/

    public long getId() {
        return id;
    }

    /**
     * This method will return the current value of Order's total
     * @return -String value for current Order's total.*/
    public int getTotal() {
        return total;
    }

    /**
     * This method will return the current value of Order's CreditCard
     * @return -String value for current Order's CreditCard.*/
    public String getCreditCarNumber() {
        return creditCarNumber;
    }

    /**
     * This method will return the current value of Order's name
     * @return -String value for current Order's name.*/

    public String getName() {
        return name;
    }

    /**
     * This method will return the current value of Order's date
     * @return -String value for current Order's date.*/
    public String getDate(){
        return date;
    }

    /**
     * This method will return the current object's information
     * @return -String value for current product's object information.*/
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", total=" + total +
                ", creditCarNumber='" + creditCarNumber + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
