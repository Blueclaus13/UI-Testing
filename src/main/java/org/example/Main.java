package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/claudia.madrid/Documents/UITesting/Drivers/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.linkText("Laptops")).click();


    }
}