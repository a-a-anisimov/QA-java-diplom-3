import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pom.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageTests {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setUp(){
        /*ChromeOptions options = new ChromeOptions();
        options = options.setBinary("C://Users/aaanisimov/AppData/Local/Yandex/YandexBrowser/Application/browser.exe");
        driver = new ChromeDriver(options);*/
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    @DisplayName("Testing sections constructor - buns")
    public void clickBunSection() {
        homePage = new HomePage(driver);
        homePage.clickSaucesSection(); //сначала кликая на другую вкладку
        homePage.clickBunSauces();
    }
    @Test
    @DisplayName("Testing sections constructor - sauces")
    public void clickSaucesSection() {
        homePage = new HomePage(driver);
        homePage.clickSaucesSection();
    }
    @Test
    @DisplayName("Testing sections constructor - stuffing")
    public void clickStuffingSection() {
        homePage = new HomePage(driver);
        homePage.clickStuffingSection();
    }
     /*@After
    public void tearDown() {
        driver.quit();
    }*/
}
