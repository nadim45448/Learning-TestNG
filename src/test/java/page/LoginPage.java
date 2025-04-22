package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    @FindBy(id = "email")
   public WebElement txtEmail;

    @FindBy(id = "password")
   public WebElement txtPassword;

    @FindBy(tagName = "button")
    WebElement btnLogin;

    @FindBy(css = "[type=button]")
    List<WebElement> btnProfileIcon;
    @FindBy(css = "[role=menuitem]")
    List<WebElement> btnLogout;

    @FindBy(tagName = "button")
    public List<WebElement> button; // user info update



    // web element load through driver
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }

    public void doLogin(String email, String password){
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnLogin.click();

    }
    public void doLogout(){
        btnProfileIcon.get(0).click();
        btnLogout.get(1).click();
    }



}
