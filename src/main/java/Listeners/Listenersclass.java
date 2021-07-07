package Listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Listenersclass implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        System.out.println("Start Listener");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println(" Test pass Listener");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        String testcasename= result.getName();

        WebDriver driver = (WebDriver)result.getTestContext().getAttribute("webDriver");

        TakesScreenshot ts = (TakesScreenshot)driver;
        String destfile = System.getProperty("user.dir") + "\\Reports\\" + testcasename + ".jpg";
        File tt =ts.getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(tt, new File(destfile));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not copied");
        }
    }
}
