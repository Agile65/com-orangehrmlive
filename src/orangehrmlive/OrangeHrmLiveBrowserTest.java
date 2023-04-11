package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**Project-2 - Project Name: com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 */
public class OrangeHrmLiveBrowserTest {

    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        //  1. Set up the Chrome browser
        WebDriver driver=new ChromeDriver();

        //  2. Open the URL into Browser
        driver.get(baseUrl);
        //Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  3. Print the title of the page
        System.out.println(driver.getTitle());

        //  4. Print the current Url
        System.out.println(driver.getCurrentUrl());

        //  5. Print the page source
        System.out.println(driver.getPageSource());

        //  6. Enter the email to email field after finding the email field element
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");

        //7. Get Password element from webpage
        driver.findElement(By.name("password")).sendKeys("admin123");

        //8. close browser
        driver.close();
    }
}
