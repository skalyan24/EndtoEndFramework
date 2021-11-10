package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LoginPage{

    WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"en-page\"]/body/div[7]/header/div/div[3]/div[1]/ul/li[2]/a/span[1]")
    WebElement loginicon;


    @FindBy(xpath="//*[@id=\"en-page\"]/body/div[7]/header/div/div[3]/div[1]/ul/li[2]/ul/li[2]/a")
    WebElement Register;

    @FindBy(className = "ico-login")
    WebElement Login;

    public void loginIconclick(){
        loginicon.click();
    }

    public void registerClick(){
        Register.click();
    }

    public void loginclick(){
        Login.click();
    }

}
