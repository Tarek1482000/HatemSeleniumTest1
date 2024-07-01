package SeleniumGoogleChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogelTask {


    public static void main (String[] args) {
        System.setProperty("webdriver.edge.driver","C:/Users/tarek/Desktop/Test/Driver/MicrosoftWebDriver/MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement Search = driver.findElement(By.xpath("//textarea[@class = 'gLFyf']"));
        Search.sendKeys("Love");

        // Wait for the search results to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='mkHrUc']/div/div/ul")));

        WebElement SearchResultList = driver.findElement(By.xpath("//div[@class= 'mkHrUc']/div/div/ul"));
        List <WebElement> elements = SearchResultList.findElements(By.tagName("li"));
        System.out.println("Counter = " + elements.size());

        driver.quit();
    }


}
