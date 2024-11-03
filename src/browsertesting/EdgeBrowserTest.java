package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    static String baseURL = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        //1 Set up Edge browser.


        WebDriver driver = new EdgeDriver();

        //2 Open URL.
        driver.get(baseURL);

        //Maximise the Browser
        driver.manage().window().maximize();

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

        // 8 Click on the Login Button.
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

