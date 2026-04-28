package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AmazonPage {

    WebDriver driver;

    public AmazonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search() {

        driver.get("https://www.amazon.in");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for search box
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Wait for results container (IMPORTANT)
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.s-main-slot")));

        // Scroll (IMPORTANT for lazy loading)
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
    }
}