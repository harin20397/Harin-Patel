package pages;

import locators.UploadLocators;
import org.openqa.selenium.WebDriver;

public class UploadPage {

    WebDriver driver;

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile() {

        driver.get("https://the-internet.herokuapp.com/upload");

        String filePath = System.getProperty("user.dir")
                + "/src/test/resources/sample.pdf";

        // Send file to INPUT (not drag area)
        driver.findElement(UploadLocators.fileInput).sendKeys(filePath);

        driver.findElement(UploadLocators.uploadBtn).click();
    }
}