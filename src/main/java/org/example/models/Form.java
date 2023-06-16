package org.example.models;
/**
 * This class is used for Form data structure.
 * When test automation fill in the form
 * it uses the information of a Form's Object.
 *
 * @author claudia.madrid
 * */
public class Form {
    private String name;
    private String country;
    private String city;
    private String creditCard;
    private  String month;
    private  String year;
    private int total;
    private  String messageReceived;

    /**
     * This constructor accepts data for the product's name and
     * product's price.
     *
     * @param name - String value for user's name
     * @param country  -String value for user's country
     * @param city   -String value for user's city
     * @param total -int value for Order's Total
     * @param creditCard -String value for Order's Credit card number
     * @param month -String value for Credicard's expire month
     * @param month -String value for Credicard's expire year

     * */
    public Form(String name, String country, String city, String creditCard, String month, String year, int total) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.total = total;
        this.month = month;
        this.year = year;
    }

    /**
     * This method will return the current value of Order's id
     * @return -String value for current user's name.*/
    public String getName() {
        return name;
    }

    /**
     * This method will set value of user's
     * name to the value passed in to fill in the form.
     *
     * @param name-String value for current user's name.*/

    public void setName(String name) {
        this.name = name;
    }
    /**
     * This method will return the current value of user's country
     * @return -String value for current user's country.*/
    public String getCountry() {
        return country;
    }

    /**
     * This method will set value of user's country
     * to the value passed in to fill in the form.
     *
     * @param country-String value for current user's country.*/
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * This method will return the current value of user's city
     * @return -String value for current user's city.*/
    public String getCity() {
        return city;
    }
    /**
     * This method will set value of user's city
     * to the value passed in to fill in the form.
     *
     * @param city-String value for current user's city.*/
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * This method will return the current value of credicard number
     * @return -String value for current credicard number.*/
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * This method will set value of user's creditCard
     * to the value passed in to fill in the form.
     *
     * @param creditCard-String value for current user's creditCard.*/
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
    /**
     * This method will return the current value of credicard's expire month
     * @return -String value for current credicard's expire month.*/
    public String getMonth() {
        return month;
    }
    /**
     * This method will set value of creditCard's expire month
     * to the value passed in to fill in the form.
     *
     * @param month-String value for current creditCard's expire month.*/
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * This method will return the current value of credicard's expire year
     * @return -String value for current credicard's expire year.*/
    public String getYear() {
        return year;
    }
    /**
     * This method will set value of creditCard's expire year
     * to the value passed in to fill in the form.
     *
     * @param year-String value for current creditCard's expire year.*/
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * This method will return the current value of the message
     * received after submitting the form.
     * @return -int value for current order's total.*/
    public int getTotal() {
        return total;
    }
    /**
     * This method will set value of order's total
     * to the value passed in to fill in the form.
     *
     * @param total-int value for current order's total.*/
    public void setTotal(int total) {
        this.total = total;
    }
    /**
     * This method will set the value of
     * the message received after submitting the form.
     * @return -String value for current message
     * received after submitting the form.*/
    public String getMessageReceived() {
        return messageReceived;
    }
  /**
   * This method will set the value of the message
   * received after submitting the form.
   *
   * @param messageReceived-String value for current message
   *                       received after submitting the form.*/
  public void setMessageReceived(String messageReceived) {
        this.messageReceived = messageReceived;
    }
}
