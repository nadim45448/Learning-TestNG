package testrunner;

import config.Setup;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import utils.Utils;

import java.io.IOException;

public class UserProfileTestRunner extends Setup {

    @BeforeTest
    public void setAuth() throws ParseException, IOException, InterruptedException {
//        LoginPage loginPage=new LoginPage(driver);
//        loginPage.doLogin("admin@test.com","admin123");
        Utils.setAuth(driver);

    }

    @Test(priority = 1, description = "user info edit by admin")
    public void editUserInfo() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(3000);
        driver.navigate().to("https://dailyfinance.roadtocareer.net/user/dc019f37-aed3-4d17-8e71-9424348ec1dc");
        loginPage.button.get(1).click(); //Click on edit button
        WebElement txtFirstName=driver.findElement(By.name("firstName"));
        txtFirstName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        txtFirstName.sendKeys("User");
        loginPage.button.get(2).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }
    @Test(priority = 2, description = "Upload Image")
    public void uploadImage() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.button.get(1).click();
        driver.findElement(By.className("upload-input")).sendKeys(System.getProperty("user.dir")+"/src/test/resources/football.jpg");
        driver.findElement(By.xpath("//button[normalize-space()='Upload Image']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.navigate().refresh();
    }
}
