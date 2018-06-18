package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_MONTH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_YEAR_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_WAIT_FOR = "//div[contains(@class, \"_5k_5\")]/span/span";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://facebook.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());


        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select selectDay = new Select(selectCombo1);
        selectDay.selectByIndex(10);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
        Select selectMonth = new Select(selectCombo2);
        selectMonth.selectByIndex(12);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByIndex(25);


    }



}
