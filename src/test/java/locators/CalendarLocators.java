package locators;

import org.openqa.selenium.By;

public class CalendarLocators {
    public static By date28 = By.xpath("//input[@name='date']");
    public static By monthly = By.xpath("//div[@class='btn-group']//a[@aria-label='switch to monthly layout'][normalize-space()='Monthly']");
}