import io.qameta.allure.junit4.DisplayName;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.HomePage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;

public class HomePageTests {
    private WebDriver driver;
    private HomePage homePage;
    private String text;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://stellarburgers.nomoreparties.site/");
    }
    @Test
    @DisplayName("Testing sections constructor - buns")
    public void clickBunSection() {
        homePage = new HomePage(driver);
        homePage.clickSaucesSection(); //сначала кликая на другую вкладку
        homePage.clickBunSauces();
        text = driver.findElement(By.xpath(".//div[@style]/div[1]")).getAttribute("class");
    }
    @Test
    @DisplayName("Testing sections constructor - sauces")
    public void clickSaucesSection() {
        homePage = new HomePage(driver);
        homePage.clickSaucesSection();
        text = driver.findElement(By.xpath(".//div[@style]/div[2]")).getAttribute("class");
    }
    @Test
    @DisplayName("Testing sections constructor - stuffing")
    public void clickStuffingSection() {
        homePage = new HomePage(driver);
        homePage.clickStuffingSection();
        text = driver.findElement(By.xpath(".//div[@style]/div[3]")).getAttribute("class");
    }
     @After
    public void tearDown() {
        MatcherAssert.assertThat(text, containsString("current"));
        driver.quit();
    }
}
