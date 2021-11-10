package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="Username")
    WebElement Username;

    @FindBy(id="Password")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"login-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input")
    WebElement Loginbutton;

    public void EnterUsername(String Uname){
        Username.sendKeys(Uname);
    }

    public  void EnterPassword(String PassW){
        Password.sendKeys(PassW);
    }

    public void clickLogin(){
        Loginbutton.click();
    }

}
