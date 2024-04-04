package org.example.selenium;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium07 {
    public static void main(String[] args) throws MalformedURLException {
        //Navigate command
        EdgeDriver driver = new EdgeDriver();

        driver.get("https://bing.com");//no back,forward always in case of get
        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();
    }
}
