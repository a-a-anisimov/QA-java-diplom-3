package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    private By inputRegistrationFieldName = By.xpath(".//*[text()='Имя']/../*[@type='text']");
    private By inputRegistrationFieldEmail = By.xpath("//*[text()='Email']/../*[@type='text']");
    private By inputRegistrationFieldPassword = By.xpath(".//*[@type='password']");
    //private By buttonRegistration = By.xpath(".//main/div/form/button");
    private By buttonRegistration = By.xpath(".//*[text()='Зарегистрироваться']");
    private By buttonEnterOnRegistrationPage = By.className("Auth_link__1fOlj");
    private By messageIncorrectPassword = By.xpath(".//p[text()='Некорректный пароль']");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName (String name) {
        driver.findElement(inputRegistrationFieldName).sendKeys(name);
    }
    public void setEmail (String email) {
        driver.findElement(inputRegistrationFieldEmail).sendKeys(email);
    }
    public void setPassword (String password) {
        driver.findElement(inputRegistrationFieldPassword).sendKeys(password);
    }
    public void clickButtonRegistration () {
        driver.findElement(buttonRegistration).click();
    }
    public void clickButtonEnter () {
        driver.findElement(buttonEnterOnRegistrationPage).click();
    }
    public void getTextFromMessageIncorrectPassword() {
        driver.findElement(messageIncorrectPassword).getText();
    }
}
