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

public class AppiumProject1 {

    WebDriverWait wait;

    AndroidDriver<MobileElement> driver = null;


    @BeforeClass

    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceId", "df1328fc");

        caps.setCapability("platformName", "android");

        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");

        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);


        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);

        wait = new WebDriverWait(driver, 20);

        //driver.findElementById("page_indicator_caret").click();


       // driver.findElementById("page_indicator_caret").click();

         //       driver.findElementById("Tasks").click();

    }


    @Test

    public void addContact() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
       driver.findElementById("tasks_fab").click();
         wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_done")));
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_done")));
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_done")));
        driver.findElementById("add_task_done").click();

        wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("task_name"),3));
        List<MobileElement> tasks =driver.findElementsById("task_name");

        String Firsttask = tasks.get(2).getText();
        String Secondtask = tasks.get(1).getText();
        String Thirdtask = tasks.get(0).getText();
        Assert.assertEquals(Firsttask,"Complete Activity with Google Tasks");
        Assert.assertEquals(Secondtask,"Complete the Activity Google Keep");
        Assert.assertEquals(Thirdtask,"Complete the second Activity Google Keep");



    }
}