package SeleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Activity2  {
    public static void main(String[] args) {

        //Firefox driver instance 
        WebDriver driver = new FirefoxDriver();

        //Application url
        driver.get("https://www.training-support.net");

        //Get the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Get the Abt link text
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + idLocator.getText());

        //Get the About Us link 
        WebElement classNameLocator = driver.findElement(By.className("green"));
        System.out.println("Text in element: " + classNameLocator.getText());

        //Get About Us link using cssSelector()
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());

        //Get the About Us link using linkText()
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());

        //Close the browser
        driver.close();
    }
}