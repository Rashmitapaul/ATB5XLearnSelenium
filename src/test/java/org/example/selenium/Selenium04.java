package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.w3c.dom.ls.LSOutput;

public class Selenium04 {
    public static void main(String[] args) {


        EdgeOptions edgeOptions = new EdgeOptions();

        //edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addArguments("incoginito");


        EdgeDriver driver = new EdgeDriver(edgeOptions);//it means Start a new edge browser
        driver.get("http://sdet.live");//open a fresh edge browser and open the url
        System.out.println(driver.getTitle());//it means print the title
//driver.manage().window().maximized();
        driver.quit();//shutdown the browser
    }
}
