package org.example.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium06 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions = new EdgeOptions();

        WebDriver driver = new EdgeDriver();//it means Start a new edge browser
        driver.get("http://sdet.live");//now this work
        System.out.println(driver.getTitle());//it means print the title
        System.out.println(driver.getCurrentUrl());
        driver.close();//Close the current browser window-> not the full browser
        //here session id  is not equal to null
       // driver.quit();//close all the windows and stop the browse
        //here session id  is equal to null
    }
}
