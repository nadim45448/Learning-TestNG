package page;

import config.UserModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserRegistrationPage {
    @FindBy(tagName = "input")
    List<WebElement> txtInput;

    @FindBy(id = "register")
    WebElement btnRegister;

    public UserRegistrationPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // 1. Using all field
    /*
    public void userRegistration(String firstName, String lastname, String email, String password, String phone, String address ){
        txtInput.get(0).sendKeys(firstName); // firstName
        txtInput.get(1).sendKeys(lastname); //secondName
        txtInput.get(2).sendKeys(email);
        txtInput.get(3).sendKeys(password); // password
        txtInput.get(4).sendKeys(phone); // phone no
        txtInput.get(5).sendKeys(address);
        txtInput.get(6).click(); // male gender
        txtInput.get(8).click(); // accept terms
        btnRegister.click();
    } */

    // 2. Skip optional fields: using user model
    public void userRegistration(UserModel userModel){
        txtInput.get(0).sendKeys(userModel.getFirstname()); // firstName
        txtInput.get(1).sendKeys(userModel.getLastname() != null ? userModel.getLastname() : ""); //secondName
        txtInput.get(2).sendKeys(userModel.getEmail()); // email
        txtInput.get(3).sendKeys(userModel.getPassword()); // password
        txtInput.get(4).sendKeys(userModel.getPhonenumber()); // phone no
        txtInput.get(5).sendKeys(userModel.getAddress() != null ? userModel.getAddress() : ""); // address
        txtInput.get(6).click(); // male gender
        txtInput.get(8).click(); // accept terms
        btnRegister.click();
    }



}
