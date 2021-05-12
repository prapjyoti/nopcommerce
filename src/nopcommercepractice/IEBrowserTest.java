package nopcommercepractice;
/*
IE Browser open successfully with given url
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://www.nopcommerce.com/demo";//variable declare
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver= new InternetExplorerDriver();//obj created
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseurl);//called the url
        driver.close();

    }
}
