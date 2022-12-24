package SeleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Activity3 {
    public static void main(String[] args) {

        //  Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Application url
        driver.get("https://www.training-support.net/selenium/simple-form");

        //Get the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //Get the input fields
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("Saahil");
        lastName.sendKeys("Sharma");

        //Enter the email
        driver.findElement(By.id("email")).sendKeys("test@example.com");

        //Enter the contact number
        driver.findElement(By.id("number")).sendKeys("1234567890");

        //Click Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();

        //Close the browser
        driver.close();
    }
}