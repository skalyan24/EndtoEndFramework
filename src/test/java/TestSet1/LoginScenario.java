package TestSet1;

import ObjectRepo.RegistationPage;
import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginScenario extends driverInitializationScript{
    RegistationPage regobj;

    @BeforeClass(alwaysRun = true)
    public void objectRepo(ITestContext context) throws InterruptedException {
        regobj = new RegistationPage(driver);
        context.setAttribute("webDriver", driver);
        Thread.sleep(1000);
        regobj.loginIconclick();
        regobj.loginclick();

    }

    @Test(groups = {"Smoke"},dataProvider = "dataprover2")
    public void logintest(String Username, String password) throws InterruptedException {

        driver.findElement(By.id("Username")).sendKeys(Username);
        driver.findElement(By.id("Password")).sendKeys(password);

        driver.findElement(By.xpath("//*[@id=\"login-page\"]/body/div[6]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input")).click();
        Thread.sleep(2000);
    }


    @DataProvider(name = "dataprover2")
    public Object[][] loginincorrect()
    {
        return new Object[][]{
                { "kalyan", "test" },


        };


}}
