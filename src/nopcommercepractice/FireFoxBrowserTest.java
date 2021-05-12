package nopcommercepractice;
/*
All Firefox Browser open successfully with given url.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.nopcommerce.com/demo";//variable declare
        //set property the path and browser
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();//obj created
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();

    }
}
