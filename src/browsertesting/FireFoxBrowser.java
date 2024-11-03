package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 *  * 1. Set up Chrome browser.
 *  * 2. Open URL.
 *  * 3. Print the title of the page.
 *  * 4. Print the current URL.
 *  * 5. Print the page source.
 *  * 6. Enter the email in the email field.
 *  * 7. Enter the password in the password field.
 *  * 8. Click on the Login Button.
 *  * 9. Print the current URL.
 *  * 10. Refresh the page.
 *  * 11. Close the browser.
 */

public class FireFoxBrowser {

    static String baseurl= "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {

        //1. Set up FireFox browser.
        WebDriver driver = new FirefoxDriver();

        //* 2. Open URL.
        driver.get(baseurl);

        // minimize
        driver.manage().window().minimize();

        // wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //* 3. Print the title of the page.
        System.out.println(" This is the title of the page " +driver.getTitle());


        //* 4. Print the current URL.
        System.out.println(" This is  the current URL: " +driver.getCurrentUrl());

        //* 5. Print the page source.
        System.out.println(" This is the page source:"+ driver.getPageSource());

        //* 6. Enter the email in the email field.
        WebElement searchField = driver.findElement(By.name("username"));
        searchField.sendKeys("xyx123@gmail.com");

        //** 7. Enter the password in the password field.
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Ram1234");

        //* 8. Click on the Login Button.
       // String loginButton ="http://the-internet.herokuapp.com/login";
       // WebElement loginButtons=driver.findElement(By.name("submit"));
        //loginButtons.sendKeys("oky");


        //9. Print the current URL.
        System.out.println(" This is current URL:" +driver.getCurrentUrl());

        //* 10. Refresh the page.
        driver.navigate().refresh();

        // close
        driver.close();


    }
}
