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

    @Test(groups = {"Smoke"}, priority = 1)
    public void loginTestcase1(){

        regobj.sendFristName("kalyan");
        regobj.SendLastName("Kumar");
        regobj.seleccountry();
        regobj.SelectTimezone(3);
        regobj.Registerbutton();
        //Assert.assertEquals(true,false);

    }

    @Test(priority = 2)
    public void confirmerrors(){
       String returnvalue = regobj.Confirmemail_error();
       Assert.assertEquals(returnvalue,"Email is required");
    }



    @AfterClass
    public void GobackHomepage(){
       driver.findElement(By.xpath("//*[@id=\"register-page\"]/body/div[7]/header/div/div[1]/a/img")).click();
    }
}
