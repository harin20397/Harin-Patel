package pages;

import locators.DragDropLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage {

    WebDriver driver;

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDrop() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement a = driver.findElement(DragDropLocators.boxA);
        WebElement b = driver.findElement(DragDropLocators.boxB);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(a, b).perform();
    }
}