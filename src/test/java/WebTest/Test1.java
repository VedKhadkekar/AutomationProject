package WebTest;

import POClass.SauceLabLogin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BasicTest{

    @Test

    public void webTest(){

        try {
            SauceLabLogin sauceLabLogin = new SauceLabLogin(driver);
            sauceLabLogin.enterUsername("locked_out_user");
            sauceLabLogin.enterPassword("secret_sauce");
            sauceLabLogin.clickLogin();
            Assert.assertEquals(sauceLabLogin.getErrormessage(), "Epic sadface: Sorry, this user has been locked out.", "Verified");
        }
        catch (Exception e){
            //throw new ClassCastException("This is a custom exception");
        }

    }
}
