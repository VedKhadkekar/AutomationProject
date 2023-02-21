package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test

    public void webTest(){

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://stackoverflow.com/questions/42847732/how-to-run-testng-xml-from-maven-command-line");


    }
}
