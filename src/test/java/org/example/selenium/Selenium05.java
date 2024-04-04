package org.example.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium05 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions = new EdgeOptions();
       // edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);

        WebDriver driver = new EdgeDriver();//it means Start a new edge browser
       // driver.get("sdet.live");//without http this code not work

        driver.get("http://sdet.live");//now this work
        driver.quit();
    }
}
