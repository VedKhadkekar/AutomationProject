package WebTest;

import POClass.SauceLabLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BasicTest {


    @Test
    public void loginTest(){

        try {
            SauceLabLogin sauceLabLogin = new SauceLabLogin(driver);
            sauceLabLogin.enterUsername("standard_user");
            sauceLabLogin.enterPassword("secret_sauce");
            sauceLabLogin.clickLogin();
            Assert.assertEquals(sauceLabLogin.getTitle(), "PRODUCTS", "Verified");
        }
        catch (Exception e){

        }

    }
}
