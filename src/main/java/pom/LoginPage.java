package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;

    private By inputLoginFieldEmail = By.xpath(".//fieldset[1]/div/div/input");
    private By inputLoginFieldPassword = By.xpath(".//fieldset[2]/div/div/input");
    private By buttonEnterOnLoginPage = By.xpath(".//main/div/form/button");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(inputLoginFieldEmail).sendKeys(email);
    }
    public void setPassword(String password) {
        driver.findElement(inputLoginFieldPassword).sendKeys(password);
    }
    public void clickButtonEnter () {
        driver.findElement(buttonEnterOnLoginPage).click();
    }
}
