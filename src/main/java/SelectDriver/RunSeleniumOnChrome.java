package SelectDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunSeleniumOnChrome {

    public static void main (String[] args) {
    System.setProperty("webdriver.chrome.driver","C:/Users/tarek/Desktop/Test/Driver/chromedriver-win64/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    }
}
