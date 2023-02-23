package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicTest {
    WebDriver driver;


    @BeforeClass
    public void driverInitialization(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }


}
