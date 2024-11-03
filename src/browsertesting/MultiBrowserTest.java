package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "FireFox";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFOx")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println(" Wrong Browser");

        }
        driver.get(baseUrl);
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println("Page Source " + driver.getPageSource());
        WebElement searchBox = driver.findElement(By.name("username"));
        searchBox.sendKeys(" xyx123@gmail.com ");
        WebElement searchField = driver.findElement(By.name("password"));
        searchField.sendKeys(" 1234567");
        System.out.println("This is current URL:" +driver.getCurrentUrl());
        driver.navigate().refresh();
        driver.close();

    }
}
