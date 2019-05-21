import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;

/**
 * Created by Enzo Cotter on 2019/5/17.
 */
public class HandNoteTest {
    AppiumDriver driver;

    @Before
    public void setUp() throws Exception{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "LKX7N18418001925");
        cap.setCapability("platFormVersion", "9.0.0");
        cap.setCapability("automationName", "Appium");
        cap.setCapability("platformName", "Android");

        cap.setCapability("appPackage", "cn.com.open.mooc");
        cap.setCapability("appActivity", "com.imooc.component.imoocmain.index.MCMainActivity");
        cap.setCapability("deviceReadyTimeout", "30");
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.id("digit_6")).click();
        List<WebElement> btnList = driver.findElementsByClassName("android.widget.Button");
        WebElement btn7 = btnList.get(0);
        btn7.click();
        driver.findElementById("com.android.calculator2:id/op_mul").click();
        driver.findElementByXPath("//android.widget.Button[contains(@text,'5')]").click();
        driver.findElementByAccessibilityId("equals").click();


        Thread.sleep(6000);
    }

}
