package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase01 {
    @Test
    @Description("Verify the title of The TestingAcademy Website ")
    public void vwoLogin(){
        WebDriver driver = new EdgeDriver();//it means Start a new edge browser
        driver.get("https://thetestingacademy.com");//it means open this url
        System.out.println(driver.getTitle());//it means print the title

    }
}
