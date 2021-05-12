package nopcommercepractice;/*
1.Edge Browser open successfully.
2.Testing The nopCommerce Page
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://www.nopcommerce.com/demo";//variable decalre
        //set the property for browser and copy the path
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();//obj created
        driver.manage().window().maximize();//use method for maximize wind and below fo timeout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();//close driver for browser
    }

}