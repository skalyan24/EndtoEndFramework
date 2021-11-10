package TestSet1;

import io.github.bonigarcia.wdm.WebDriverManager;
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

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

        }

        String Website = "https://www.nopcommerce.com";
        driver.get(Website);
        driver.manage().window().maximize();
    }





}
