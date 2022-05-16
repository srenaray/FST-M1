package examples;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

import io.appium.java_client.MobileBy;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstExampleTest {

      AndroidDriver<MobileElement> driver;

    @BeforeClass

    public void setUp() throws MalformedURLException {
        //throws MalformedURLException

        // Set the Desired Capabilities

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceId", "df1328fc");

        caps.setCapability("platformName", "android");

        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("appPackage", "com.oneplus.calculator");

        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);

    }

    @Test

    public void add() {

        // Using resource-id

        driver.findElementById("digit_8").click();
        driver.findElementById("op_mul").click();
        driver.findElementById("digit_6").click();
        driver.findElementById("eq").click();

        // Display Result

        String result = driver.findElement(MobileBy.id("result")).getText();

        System.out.println(result);


        // Assertion

        Assert.assertEquals(result, "48");
    }

    @AfterClass

    public void tearDown() {

        driver.quit();

    }
}