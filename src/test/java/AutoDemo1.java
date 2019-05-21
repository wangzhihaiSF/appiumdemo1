import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Enzo Cotter on 2019/5/16.
 */
public class AutoDemo1 {
    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver driver;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platFormVersion", "8.1.0");
        cap.setCapability("automationName", "Appium");
        cap.setCapability("platformName", "Android");
        cap.setCapability("app", "C:\\Users\\lenovo\\imooc7.1.210102001android.apk");
        cap.setCapability("appPackage", "cn.com.open.mooc");
        cap.setCapability("appActivity", "com.imooc.component.imoocmain.splash.MCSplashActivity");
        cap.setCapability("deviceReadyTimeout", "30");
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.quit();


    }
}
