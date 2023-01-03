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
    @Test //вход по кнопке «Войти в аккаунт» на главной
    public void loginAcrossHomePage() {
        driver.get("https://stellarburgers.nomoreparties.site");
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();

        loginPage = new LoginPage(driver);
        loginPage.setEmail("aaa1@ya.ru");
        loginPage.setPassword("aaaaaa1");
        loginPage.clickButtonEnter();


    }
    @Test //вход через кнопку «Личный кабинет» (+ проверка перехода по клику на «Личный кабинет»)
    public void loginAcrossPersonalAccountPage() {
        driver.get("https://stellarburgers.nomoreparties.site");
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();
        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);

        loginPage = new LoginPage(driver);
        loginPage.setEmail("aaa1@ya.ru");
        loginPage.setPassword("aaaaaa1");
        loginPage.clickButtonEnter();
    }
    @Test //вход через кнопку в форме регистрации
    public void loginAcrossRegistrationPage(){
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.scrollDownPage();
        registrationPage.clickButtonEnter();

        loginPage = new LoginPage(driver);
        loginPage.setEmail("aaa1@ya.ru");
        loginPage.setPassword("aaaaaa1");
        loginPage.clickButtonEnter();
    }
    @Test //вход через кнопку в форме восстановления пароля
    public void loginAcrossRecoveryPassword(){
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage(driver);
        passwordRecoveryPage.clickEnterPasswordRecoveryPage();

        loginPage = new LoginPage(driver);
        loginPage.setEmail("aaa1@ya.ru");
        loginPage.setPassword("aaaaaa1");
        loginPage.clickButtonEnter();
    }


     /*@After
    public void tearDown() {
        driver.quit();
    }*/
}
