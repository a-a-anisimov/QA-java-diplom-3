package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {
    private WebDriver driver;
    private By buttonEnterPasswordRecoveryPage = By.className("Auth_link__1fOlj");

    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickEnterPasswordRecoveryPage() {
        driver.findElement(buttonEnterPasswordRecoveryPage).click();
    }
}
