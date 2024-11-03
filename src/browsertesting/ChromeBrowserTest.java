package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

public class ChromeBrowserTest {

  static  String baseURL = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        //1 Set up Chrome browser.


        WebDriver driver = new ChromeDriver();


        //2 Open URL.
        driver.get(baseURL);

        //Minimise the Browser
        driver.manage().window().minimize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        //3 Print the title of the page.
        System.out.println( "This is the title of the page " + driver.getTitle());

        //4 Print the current URL.
        System.out.println("Current URL is " + driver.getCurrentUrl());


        //5 Print the page source.
        System.out.println("Page Source " + driver.getPageSource());








        // 6 Enter the email in the email field.
        WebElement searchBox = driver.findElement(By.name("username"));
        searchBox.sendKeys(" xyx123@gmail.com ");

        // 7 Enter the password in the password field.
        WebElement searchField = driver.findElement(By.name("password"));
        searchField.sendKeys(" 1234567");

        //Click on the Login Button.
        //WebElement loginLink = driver.findElement(By.linkText("submit"));
        // loginLink.click();

        //9. Print the current URL.
        System.out.println("This is current URL:" +driver.getCurrentUrl());

        //10. Refresh the page.
        driver.navigate().refresh();


        // close the browser
        driver.close();


    }
}





