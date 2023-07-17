package POClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class SauceLabLoginPage{
    WebDriver driver;
    public SauceLabLoginPage(WebDriver driver){
                this.driver = driver;
        PageFactory.initElements(new DefaultElementLocatorFactory(driver),this);
    }

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement login;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement title;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errormessage;

    public String getTitle(){
        return title.getText();
    }

    public String getErrormessage(){
        return errormessage.getText();
    }

    public void enterUsername(String uname){
        username.sendKeys(uname);
    }

    public void enterPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickLogin(){
        login.click();
    }


}
