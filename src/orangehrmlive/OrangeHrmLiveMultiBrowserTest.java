package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class OrangeHrmLiveMultiBrowserTest {

    // static variable declaration and assigning values to it

    static String browser="Edge";
    static String baseUrl="https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //  1. Set up the browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver=new EdgeDriver();
        }else{
            System.out.println("Wrong browser name");
        }

        //  2. Open the Url into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  3. Print the title of the page
        System.out.println(driver.getTitle());

        //  4. Print the currant Url
        System.out.println(driver.getCurrentUrl());

        //  5. Print the page source
        System.out.println(driver.getPageSource());

        //  6. Enter email to Email field after finding the element
        WebElement emailField= driver.findElement(By.name("username"));
        emailField.sendKeys("hprime123@gmail.com");

        //  7. Enter password to Password field after finding the element
        driver.findElement(By.name("password")).sendKeys("123423");

        //  8. Close the browser
        driver.close();

    }
}
