package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PersonalAccountPage    {
    private WebDriver driver;
    private By buttonLogOutOfAccount = By.xpath(".//main/div/nav/ul/li[3]/button");
    private By headerConstructor = By.xpath(".//header/nav/ul/li[1]/a/p");
    private By logo = By.xpath(".//header/nav/div/a");
    public PersonalAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonGetOutOfAccount() {
        driver.findElement(buttonLogOutOfAccount).click();
    }
    public void clickHeaderConstructor() {
        driver.findElement(headerConstructor).click();
    }
    public void clickLogo() {
        driver.findElement(logo).click();
    }
}
