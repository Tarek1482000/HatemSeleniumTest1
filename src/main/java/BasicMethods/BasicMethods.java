package BasicMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/tarek/Desktop/Test/Driver/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contentEquals("https://www.google.com/"))
        {
            System.out.println("Pass Url");
        }
        else {
            System.out.println("Fail");
        }


        String actualTitle = driver.getTitle();
        if(actualTitle.contentEquals("Google"))
        {
            System.out.println("Pass Title");
        }
        else {
            System.out.println("Fail");
        }


    }
}
