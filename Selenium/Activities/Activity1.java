package SeleniumActivities;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Activity1 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");


        driver.close();
    }

}