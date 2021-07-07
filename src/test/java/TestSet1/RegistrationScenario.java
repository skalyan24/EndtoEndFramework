package TestSet1;

import ObjectRepo.RegistationPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class RegistrationScenario extends driverInitializationScript {

     RegistationPage regobj;

    @BeforeClass(alwaysRun = true)
    public void objectRepo(ITestContext context) throws InterruptedException {
        regobj = new RegistationPage(driver);
        context.setAttribute("webDriver", driver);
        Thread.sleep(1000);
        regobj.loginIconclick();
        regobj.registerClick();

    }

    @Test(groups = {"Smoke"})
    public void loginTestcase1(){

        regobj.sendFristName("kalyan");
        //Assert.assertEquals(true,false);

    }
    @BeforeMethod
    public void beforemethod(){
    System.out.println("sdfsdf");
    }

    @AfterClass
    public void GobackHomepage(){
        driver.findElement(By.xpath("//*[@id=\"register-page\"]/body/div[6]/header/div/div[1]/a/img")).click();
    }
}
