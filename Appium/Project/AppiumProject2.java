package liveProject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AppiumProject2
{

    WebDriverWait wait;

    AndroidDriver<MobileElement> driver = null;
    @BeforeClass

    public void setup() throws MalformedURLException {

       DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceId", "df1328fc");

        caps.setCapability("platformName", "android");

        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");

        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);


        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);

        wait = new WebDriverWait(driver, 20);


    }

    @Test

    public void addContact() throws InterruptedException {


        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
        driver.findElementById("new_note_button").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
        driver.findElementById("editable_title").sendKeys("Bday");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("edit_note_text")));
        driver.findElementById("edit_note_text").sendKeys("Welcome to Sudhanva Bday");
       //driver.findElementById("add_task_title").sendKeys("browse_note_interior_content");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Navigate up")));
        driver.findElementByAccessibilityId("Navigate up").click();
        // Print page title

        //String pageTitle = driver.findElementByXPath("//android.widget.TextView[contains(@text, 'New Tab')]").getText();
        String pageTitle = driver.findElementById("index_note_text_description").getText();

        System.out.println("Page title is: " + pageTitle);



        // Assertion

        Assert.assertEquals(pageTitle, "Welcome to Sudhanva Bday");


    }
}
