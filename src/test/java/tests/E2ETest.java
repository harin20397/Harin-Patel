package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import utils.DriverFactory;
import pages.*;
import org.testng.annotations.Test;

import java.util.List;

public class E2ETest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.getDriver();
    }

    @Test
    public void runAllTasks() {

        // Task 1
        UploadPage upload = new UploadPage(driver);
        upload.uploadFile();
        Assert.assertTrue(driver.findElement(By.id("uploaded-files")).isDisplayed());

        // Task 2
        DragDropPage drag = new DragDropPage(driver);
        drag.dragAndDrop();
        Assert.assertTrue(driver.findElement(By.id("column-a")).getText().contains("B"));

        // Task 4 (Calendar - already handled inside page)
        CalendarPage cal = new CalendarPage(driver);
        cal.selectFutureDate();

        // Task 5
        AmazonPage amazon = new AmazonPage(driver);
        amazon.search();

        List<WebElement> results = driver.findElements(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result']"));

        Assert.assertTrue(results.size() > 0, "No search results found on Amazon");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}