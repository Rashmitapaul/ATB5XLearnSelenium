package org.example.selenium;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium08 {
    //Open app.vwo.com
    //Print the title and get the current url
    //Verify the current url is aap.vwo.com
        @Test(groups = "QA")
        @Description("Verify the vwo app")
    public void testVWOLogin(){
            WebDriver driver = new EdgeDriver();
            driver.get("https://aap.vwo.com");
            System.out.println(driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"VWO - Application");
            Assert.assertEquals(driver.getCurrentUrl(),"https://aap.vwo.com");

    }
}
