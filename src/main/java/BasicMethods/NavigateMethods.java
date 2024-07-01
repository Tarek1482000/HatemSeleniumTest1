package BasicMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/tarek/Desktop/Test/Driver/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

    }
}
