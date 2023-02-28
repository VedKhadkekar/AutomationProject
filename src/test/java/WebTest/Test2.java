package WebTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Test2 extends BasicTest {

    @DataProvider(name ="getAllDataFromExcelSheet")
    public Object[][] getAllDataFromExcelSheet(){
        Object[][] arrObj= getExcelData("Test2","Sheet1");
        return  arrObj;
    }
    @Test(dataProvider = "getAllDataFromExcelSheet")
    public void loginTest(String username, String password){


        //try {
            sauceLabLogin.enterUsername(username);
            sauceLabLogin.enterPassword(password);
            sauceLabLogin.clickLogin();
            Assert.assertEquals(sauceLabLogin.getTitle(), "PRODUCTS", "Verified");
        /*}
        catch (Exception e){

        }*/

    }


}
