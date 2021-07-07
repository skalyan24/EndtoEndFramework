package TestSet1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class driverInitializationScript {

     public static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void initializewebdriver(String browser) {

        switch (browser)
        {
            case "chrome":

                System.setProperty("webdriver.chrome.driver","C:\\Users\\kalya\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver","C:\\Users\\kalya\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
        }

        String Website = "https://www.nopcommerce.com";
        driver.get(Website);
        driver.manage().window().maximize();
        System.out.println("testing");
    }





}
