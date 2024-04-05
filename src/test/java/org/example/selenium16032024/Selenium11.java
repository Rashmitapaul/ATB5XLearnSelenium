package org.example.selenium16032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium11 {
    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void testVWOLogin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        //Question:- print all the anchor tag on this vwo.com
        // a tag and print getText
        List<WebElement> all_atags = (List<WebElement>) driver.findElements(By.tagName("a"));
       // all_atags.get(0).click();
        //all_atags.get(0).click();
        //all_atags.size();
for (WebElement element:all_atags){

    System.out.println(element.getText());
}
 driver.close();


    }
}
