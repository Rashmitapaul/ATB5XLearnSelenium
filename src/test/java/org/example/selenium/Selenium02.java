package org.example.selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium02 {
// Important concept of oops-->
    // Interface interfaceRef = new class;
    //1.Inheritance
    //2.Upcasting -> Dynamic dispatch
    WebDriver driver = new EdgeDriver();
    WebDriver driver2 = new ChromeDriver();
    WebDriver driver3 = new FirefoxDriver();
    WebDriver driver4 = new InternetExplorerDriver();
    WebDriver driver5 = new SafariDriver();
// selenium 4 have  remove Opera
    //SearchContent(Interface)--> have 2 function findElements and findElements-->GGF
    // WebDriver(Interface)--> Some incomplete function --> Grand Father
    // RemoteDriver(Class)-->It also have function --> Father
    // ChromeDriver,EdgeDriver,FirefoxDriver,InternetExplorerDriver,SafariDriver(Class)--> Son

   // SearchContext driver1 =new ChromeDriver();// this concept called as Dynamic dispatch, its basically means any GGF,GF, F reference to child object-> oops concept
 // SearchContext have only 2 function that's why not use SearchContext


}
