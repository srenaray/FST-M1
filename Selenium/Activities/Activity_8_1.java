package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;


public class Activity_8_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        //Application url
        driver.get("https://training-support.net/selenium/tables");

        //Get columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        //Get rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));

        //Number of columns
        System.out.println("Number of columns are: " + cols.size());
        //Number of rows
        System.out.println("Number of rows are: " + rows.size());

        //Get third row values and print them
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
            
        }
    }
}
