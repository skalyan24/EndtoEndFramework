package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistationPage extends HomePage {

    WebDriver driver;

    public RegistationPage(WebDriver driver){
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="FirstName")
    WebElement FirstName;

    public void sendFristName(String fname){

        FirstName.sendKeys(fname);
    }

}
