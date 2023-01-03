package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;

    private By buttonPersonalAccount = By.xpath(".//p[text()='Личный Кабинет']");
    private By bunSection = By.xpath(".//section[1]/div[1]/div[1]");
    private By saucesSection = By.xpath(".//section[1]/div[1]/div[2]");
    private By stuffingSection = By.xpath(".//section[1]/div[1]/div[3]");

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
