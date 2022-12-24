package SeleniumActivities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException{
//  Firefox driver
        WebDriver driver = new FirefoxDriver();
// Application url
        driver.get("https://www.training-support.net");
        Thread.sleep(5000);
// Close the browsee
        driver.close();

    }
}