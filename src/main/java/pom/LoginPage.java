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

    public void setData(String email, String password) {
        driver.findElement(inputLoginFieldEmail).sendKeys(email);
        driver.findElement(inputLoginFieldPassword).sendKeys(password);
        driver.findElement(buttonEnterOnLoginPage).click();
    }
}
