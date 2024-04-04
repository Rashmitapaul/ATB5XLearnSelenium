package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium01 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();//it means Start a new edge browser
        driver.get("http://sdet.live");//open a fresh edge browser and open the url
        driver.quit();//shutdown the browser
    }
}
