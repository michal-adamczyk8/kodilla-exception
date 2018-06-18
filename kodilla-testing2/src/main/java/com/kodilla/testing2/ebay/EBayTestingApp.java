package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCHBAR = "_nkw";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://ebay.com");

        WebElement searchBar = driver.findElement(By.name(SEARCHBAR));
        searchBar.sendKeys("Laptop");
        searchBar.submit();
    }
}
