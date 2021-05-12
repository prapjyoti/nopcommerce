package nopcommercepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseurl = "https://www.nopcommerce.com/demo"; //url store in string data type
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//set the property and path
        WebDriver driver = new ChromeDriver();//obj created for chrome driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseurl);//called url
        driver.close();



    }
}