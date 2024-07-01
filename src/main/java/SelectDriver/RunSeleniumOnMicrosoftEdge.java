package SelectDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunSeleniumOnMicrosoftEdge {

    public static void main (String[] args) {
    System.setProperty("webdriver.edge.driver","C:/Users/tarek/Desktop/Test/Driver/MicrosoftWebDriver/MicrosoftWebDriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();

    }
}
