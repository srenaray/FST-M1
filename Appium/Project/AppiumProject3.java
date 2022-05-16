package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

import java.net.MalformedURLException;
import java.net.URL;


public class AppiumProject3

{


    WebDriverWait wait;

    AndroidDriver<MobileElement> driver = null;
    @BeforeClass

    public void setup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceId", "df1328fc");

        caps.setCapability("platformName", "android");

        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");

        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);


        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);

        wait = new WebDriverWait(driver, 20);
        driver.get("https://www.training-support.net/selenium");


    }

    @Test

    public void  training () throws InterruptedException {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));

        driver.findElement(

                        MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(text(\"To-Do List\"))"))

                .click();

        driver.findElementByClassName("android.widget.EditText").sendKeys("List1");
       // wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.Button")));

          //      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("android.widget.Button"))).getText();
driver.findElementByClassName("android.widget.Button").click();

//driver.findElementByXPath("android.widget.Button").click();
    }


                    }


