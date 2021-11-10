package TestSet1;

import ObjectRepo.RegistationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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

        regobj.EnterUsername(Username);
        regobj.EnterPassword(password);
        regobj.clickLogin();
        Assert.assertTrue(false);


    }


    @DataProvider(name = "dataprover2")
    public Object[][] loginincorrect()
    {
        return new Object[][]{
                { "kalyan2342342", "test" },

        };


}}
