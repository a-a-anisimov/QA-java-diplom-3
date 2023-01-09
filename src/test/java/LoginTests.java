import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.*;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;
    private LoginPage loginPage;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    @DisplayName("Login across HomePage")
    public void loginAcrossHomePage() {
        driver.get("https://stellarburgers.nomoreparties.site");
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();

        loginPage = new LoginPage(driver);
        loginPage.setData("aaa1@ya.ru", "aaaaaa1");
    }
    @Test
    @DisplayName("Login across PersonalAccountPage")
    public void loginAcrossPersonalAccountPage() {
        driver.get("https://stellarburgers.nomoreparties.site");
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();
        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);

        loginPage = new LoginPage(driver);
        loginPage.setData("aaa1@ya.ru", "aaaaaa1");
    }
    @Test
    @DisplayName("Login across RegistrationPage")
    public void loginAcrossRegistrationPage(){
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickButtonEnter();

        loginPage = new LoginPage(driver);
        loginPage.setData("aaa1@ya.ru", "aaaaaa1");
    }
    @Test
    @DisplayName("Login across RecoveryPassword")
    public void loginAcrossRecoveryPassword(){
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage(driver);
        passwordRecoveryPage.clickEnterPasswordRecoveryPage();

        loginPage = new LoginPage(driver);
        loginPage.setData("aaa1@ya.ru", "aaaaaa1");
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
