package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccountPage {
    private WebDriver driver;
    private By buttonLogOutOfAccount = By.xpath(".//button[text()='Выход']");
    private By headerConstructor = By.xpath(".//p[text()='Конструктор']");
    private By logo = By.xpath(".//a[@href='/']");

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
