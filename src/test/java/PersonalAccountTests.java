import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pom.HomePage;
import pom.LoginPage;
import pom.PersonalAccountPage;

import java.util.concurrent.TimeUnit;

public class PersonalAccountTests {
    private WebDriver driver;

    @Before
    public void setUp(){
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    @DisplayName("Logout")
    public void logOutOfAccount(){
        driver.get("https://stellarburgers.nomoreparties.site/");

        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmail("aaa1@ya.ru");
        loginPage.setPassword("aaaaaa1");
        loginPage.clickButtonEnter();

        homePage.clickButtonPersonalAccount();

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        personalAccountPage.clickButtonGetOutOfAccount();
    }
    @Test
    @DisplayName("Transition from Personal account to Constructor across click to \"Constructor\"")
    public void transitionAcrossConstructor(){
        driver.get("https://stellarburgers.nomoreparties.site/");

        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmail("aaa1@ya.ru");
        loginPage.setPassword("aaaaaa1");
        loginPage.clickButtonEnter();

        homePage.clickButtonPersonalAccount();

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        personalAccountPage.clickHeaderConstructor();
    }
    @Test
    @DisplayName("Transition from Personal account to Constructor across click to logo")
    public void transitionAcrossLogo(){
        driver.get("https://stellarburgers.nomoreparties.site/");

        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmail("aaa1@ya.ru");
        loginPage.setPassword("aaaaaa1");
        loginPage.clickButtonEnter();

        homePage.clickButtonPersonalAccount();

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        personalAccountPage.clickLogo();
    }
    /*@After
    public void tearDown() {
        driver.quit();
    }*/
}
