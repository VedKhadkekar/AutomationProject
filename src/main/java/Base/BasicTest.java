package Base;

import Utils.ListnersForReport;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BasicTest{
    public RemoteWebDriver driver;
    private Properties properties;
    public  ListnersForReport listnersForReport;

    private final String propertyFilePath = System.getProperty("user.dir") +"\\src\\test\\resources\\config\\selenium.properties";

    @BeforeClass
    public void driverInitialization() throws IOException {
        properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(propertyFilePath);
        properties.load(fileInputStream);


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    @BeforeMethod
    public void openBrowser(ITestContext context) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        URL url = new URL("http://localhost:4444/wd/hub");
        if(properties.getProperty("browser.name").equalsIgnoreCase("chrome")){
            driver = new RemoteWebDriver(url,desiredCapabilities);
        }else if(properties.getProperty("browser.name").equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if(properties.getProperty("browser.name").equalsIgnoreCase("edgechrome")){
            driver = new EdgeDriver();
        }
        else if(properties.getProperty("browser.name").equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        else{

        }
        context.setAttribute("driver",driver);
        driver.get(properties.getProperty("browser.url"));
        sauceLabLogin = new SauceLabLoginPage(driver);
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

    /*public List<HashMap<String,String>> getDatafromJSON(String path) throws IOException {
        String input = FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String,String>> data = mapper.readValue(input,
                new TypeReference<List<HashMap<String,String>>>() {
                });
        return data;
    }*/

    public static Object[][] getExcelData(String fileName, String sheetName) {
        String[][] data = null;
        try {
            fileName = System.getProperty("user.dir") +"\\src\\test\\resources\\global\\"+fileName+".xlsx";
            FileInputStream fis = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow row = sheet.getRow(0);
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCols = row.getLastCellNum();
            XSSFCell cell;
            data = new String[noOfRows - 1][noOfCols];
            for (int i = 1; i < noOfRows; i++) {
                for (int j = 0; j < noOfCols; j++) {
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();
                }
            }
        } catch (Exception e) {
            System.out.println("The exception is: " + e.getMessage());
        }

        return data;
    }



    /*public void config(){
        Config config = new
        
    }*/

}
