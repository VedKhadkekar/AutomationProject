package WebTest;

import Base.BasicTest;
import POClass.SauceLabLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BasicTest{
    SauceLabLoginPage sauceLabLogin = new SauceLabLoginPage(driver);

    @Test

    public void webTest(){

        sauceLabLogin.enterUsername("locked_out_user");
        sauceLabLogin.enterPassword("secret_sauce");
        sauceLabLogin.clickLogin();
        Assert.assertEquals(sauceLabLogin.getErrormessage(), "Epic sadface: Sorry, this user has been locked out.", "Verified");

    }
}
