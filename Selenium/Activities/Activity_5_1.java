package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_1 {

    public static void main(String[] args) {

        // Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Application url
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        //Find the checkbox
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());

        driver.findElement(By.id("toggleCheckbox")).click();

        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());

        //Close the browser
        driver.close();

    }

}