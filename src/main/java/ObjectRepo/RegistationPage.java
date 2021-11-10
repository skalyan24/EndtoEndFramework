package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistationPage extends HomePage {

    WebDriver driver;

    public RegistationPage(WebDriver driver){
       super(driver);

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="FirstName")
    WebElement FirstName;

    @FindBy(id="LastName")
    WebElement LastName;

    @FindBy(id="Email")
    WebElement Email;

    @FindBy(id ="ConfirmEmail-error")
    WebElement Confirmemailerror;

    @FindBy(id="CountryId")
    WebElement country;

    @FindBy(id ="TimeZoneId")
    WebElement Timezone;

    @FindBy(id ="register-button")
    WebElement registerbutton;


    public void sendFristName(String fname){

        FirstName.sendKeys(fname);
    }

    public void seleccountry(){
        Select countrylist = new Select(country);
        countrylist.selectByIndex(1);
    }

    public void SendLastName(String Lname){
        LastName.sendKeys(Lname);
    }

    public void SendEmail(String eMail){
        Email.sendKeys(eMail);
    }

    public void SelectTimezone(int timezone){
        Select timeZone = new Select(Timezone);
        timeZone.selectByIndex(timezone);
    }

    public void Registerbutton(){
        registerbutton.click();
    }

    public String Confirmemail_error()
    {
        String  errorconfirm = Confirmemailerror.getText();
        return errorconfirm;
    }

}
