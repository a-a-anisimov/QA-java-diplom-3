package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By inputLoginFieldEmail = By.xpath(".//input[@type='text' and @name='name']");
    private By inputLoginFieldPassword = By.xpath(".//input[@type='password']");
    private By buttonEnterOnLoginPage = By.xpath(".//button[text()='Войти']");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setData(String email, String password) {
        driver.findElement(inputLoginFieldEmail).sendKeys(email);
        driver.findElement(inputLoginFieldPassword).sendKeys(password);
        driver.findElement(buttonEnterOnLoginPage).click();
    }
}
