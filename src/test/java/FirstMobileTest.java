import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstMobileTest {

    @Test

    public void firstMobileTest() throws MalformedURLException {

        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        serviceBuilder.withAppiumJS(new File("C:\\Users\\Hp\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"));
        serviceBuilder.withIPAddress("127.0.0.1");
        serviceBuilder.usingPort(4723).build().start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Test");
        options.setApp("G:\\MobileAutomationProject\\src\\main\\resources\\ApiDemos-debug.apk");

        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

       // androidDriver.findElement(AppiumBy.accessibilityId("")).click();


    }



}
