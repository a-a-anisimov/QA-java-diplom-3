import com.github.javafaker.Faker;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.RegistrationPage;

import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)

public class RegistrationTests {
    static
    Faker faker = new Faker();
    private WebDriver driver;
    private RegistrationPage registrationPage;
    private final String name;
    private final String email;
    private final String password;

    public RegistrationTests(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Parameterized.Parameters(name = "name: {0}, email: {1}, password: {2}")
    public static Object[][] questionsAndAnswers() {
        return new Object[][]{
                {faker.name().firstName(), faker.internet().emailAddress(), faker.internet().password(6,10)}, //успешная регистрация
                {faker.name().firstName(), faker.internet().emailAddress(), faker.internet().password(3,5)}, //регистрация не произойдет - появится сообщение "Некорректный пароль" (пароль менее 6 символов)
        };
    }
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site/register");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    @DisplayName("1 successfully and 1 unsuccessfully (password shorter than 6 symbols) registration")
    public void setData() {
        registrationPage = new RegistrationPage(driver);
        registrationPage.setName(name);
        registrationPage.setEmail(email);
        registrationPage.setPassword(password);
        registrationPage.clickButtonRegistration();
        if (password.length() >= 6) {
            Assert.assertEquals("Вход", driver.findElement(By.xpath(".//h2[text()='Вход']")).getText());
        } else {
            Assert.assertEquals("Некорректный пароль", driver.findElement(By.xpath(".//p[text()='Некорректный пароль']")).getText());
        }
    }
   @After
    public void tearDown() {
        driver.quit();
    }
}
