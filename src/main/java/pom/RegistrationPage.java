package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class RegistrationPage {
    private WebDriver driver;

    private By inputRegistrationFieldName = By.xpath(".//fieldset[1]/div/div/input");
    private By inputRegistrationFieldEmail = By.xpath(".//fieldset[2]/div/div/input");
    private By inputRegistrationFieldPassword = By.xpath(".//fieldset[3]/div/div/input");
    private By buttonRegistration = By.xpath(".//main/div/form/button");
    private By buttonEnterOnRegistrationPage = By.className("Auth_link__1fOlj");
    private By scrollDown = By.className("Auth_link__1fOlj");

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
    public void scrollDownPage() {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
