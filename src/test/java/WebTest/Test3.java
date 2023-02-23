package WebTest;

import POClass.SauceLabLogin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends BasicTest {


    @Test
    public void loginTest(){


            SauceLabLogin sauceLabLogin = new SauceLabLogin(driver);
            sauceLabLogin.enterUsername("standard_userrr");
            sauceLabLogin.enterPassword("secret_sauce");
            sauceLabLogin.clickLogin();
            Assert.assertEquals(sauceLabLogin.getTitle(), "PRODUCTS", "Verified");

    }
}
