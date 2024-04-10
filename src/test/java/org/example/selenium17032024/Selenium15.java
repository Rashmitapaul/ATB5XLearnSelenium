package org.example.selenium17032024;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Selenium15 {

        //Here we use Xpath function
        @Test(groups = "QA")
        @Description("Verify the current URl, title of VWO app")
        public void testVWOLogin12() throws InterruptedException {
            WebDriver driver = new EdgeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            driver.manage().window().maximize();
            //case1
            // <a
            // href="./profile.php#login"
            //$random Make Appointment->in this case you can usd partial link text

            // Make Appointment -> text

            // </a> ->This is a closing tag

            //case2: partial link text is not supported in button

            // <button
            // href="./profile.php#login"
            //$random Make Appointment

            // Make Appointment -> text

            // </button> ->This is a closing tag
            WebElement btnElement_ID = driver.findElement(By.id("//button[contains(text(),' Appointment'"));
            btnElement_ID.click();
            // Wait for 2 Seconds
            Thread.sleep(2000);
            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");


            //WebElement username_element = driver.findElement(By.id("txt-username"));
            WebElement username_element = driver.findElement(By.name("username"));

            // WebElement username_element = driver.findElement(By.xpath("//input[@id='txt-username']"));

            username_element.sendKeys("John Doe");
            WebElement password_element = driver.findElement(By.xpath("//input[@id='txt-password']"));
            password_element.sendKeys("ThisIsNotAPassword");

            driver.findElement(By.id("btn-login")).click();

            // driver.quit();






        }



}
