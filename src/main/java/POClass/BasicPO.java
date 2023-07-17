package POClass;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class BasicPO{
    RemoteWebDriver driver;

    public BasicPO(RemoteWebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new DefaultElementLocatorFactory(driver),this);
    }



}
