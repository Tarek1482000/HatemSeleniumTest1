package InspectElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManualXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/tarek/Desktop/Test/Driver/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");


        /*
              xpath("//tagName[@attribute = 'attributeValue']")
              xpath("//tagName[contains(@attribute , 'attributeValue')]") No need to write all attribute or attributeValue
         */
        WebElement search = driver.findElement(By.xpath("//textarea[@aria-label = 'بحث']"));

        WebElement search2 = driver.findElement(By.xpath("//textarea[contains(@aria-label,'ب')]"));

        search2.sendKeys("Hello");
    }
}
