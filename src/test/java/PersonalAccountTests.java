import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pom.HomePage;
import pom.LoginPage;
import pom.PersonalAccountPage;

import java.util.concurrent.TimeUnit;

public class PersonalAccountTests {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://stellarburgers.nomoreparties.site/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        HomePage homePage = new HomePage(driver);
        homePage.clickButtonPersonalAccount();

        loginPage = new LoginPage(driver);
        loginPage.setData("aaa1@ya.ru", "aaaaaa1");

        homePage.clickButtonPersonalAccount();
    }
    @Test
    @DisplayName("Logout")
    public void logOutOfAccount(){
        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        personalAccountPage.clickButtonGetOutOfAccount();
    }
    @Test
    @DisplayName("Transition from Personal account to Constructor across click to \"Constructor\"")
    public void transitionAcrossConstructor(){
        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        personalAccountPage.clickHeaderConstructor();
    }
    @Test
    @DisplayName("Transition from Personal account to Constructor across click to logo")
    public void transitionAcrossLogo(){
        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        personalAccountPage.clickLogo();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
