package WebTest;

import Base.BasicTest;
import POClass.SauceLabLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends BasicTest {

    SauceLabLoginPage sauceLabLogin = new SauceLabLoginPage(driver);

    @Test
    public void loginTest(){

        sauceLabLogin.enterUsername("standard_userrr");
        sauceLabLogin.enterPassword("secret_sauce");
        sauceLabLogin.clickLogin();
        Assert.assertEquals(sauceLabLogin.getTitle(), "Products", "Verified");


    }
}
