package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
    public WebDriver driver;
    By signin = By.cssSelector("a[href*='sign_in']");
    By title = By.xpath("//h2[text()='Featured Courses']");
    By NavBar = By.xpath("//*[contains(@class, 'navbar')]");

    public LandingPage(WebDriver driver)
    {
        this.driver = driver;
        // We created this constructor as the driver that we are returning to the HomePage class has no life so by this we
        // have have assigned the driver object in Homepage which has life to the driver obj in this class and have passed
        // this driver as an argument in the LandingPage class obj
        // In the code this.driver = driver the 1st driver obj is of this class and the 2nd one is of HomePage class
    }

    public WebElement getLogin()
    {
        return driver.findElement(signin);
        // As signin is a webelement so the method should have a return type as Webelement
    }

    public WebElement getTitle()
    {
        return driver.findElement(title);
    }

    public WebElement getNavigationBar()
    {
        return driver.findElement(NavBar);
    }
}
