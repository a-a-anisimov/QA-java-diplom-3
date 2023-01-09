package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By buttonPersonalAccount = By.xpath(".//p[text()='Личный Кабинет']");
    private By bunSection = By.xpath(".//span[text()='Булки']");
    private By saucesSection = By.xpath(".//span[text()='Соусы']");
    private By stuffingSection = By.xpath(".//span[text()='Начинки']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickButtonPersonalAccount() {
        driver.findElement(buttonPersonalAccount).click();
    }
    public void clickBunSauces() {
        driver.findElement(bunSection).click();
    } public void clickSaucesSection() {
        driver.findElement(saucesSection).click();
    }
    public void clickStuffingSection() {
        driver.findElement(stuffingSection).click();
    }
}
