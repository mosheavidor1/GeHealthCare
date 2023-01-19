
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestUI {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test

    public void Login() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().fullscreen();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");

        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
        driver.manage().window().fullscreen();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Time']")).click();
        driver.manage().window().fullscreen();

        Thread.sleep(1000);

        driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='View'])[2]")).click();

        driver.manage().window().fullscreen();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".oxd-icon.bi-chat-dots-fill")).click();
        Thread.sleep(1000);

        WebElement comment = driver.findElement(By.xpath("//textarea[@placeholder='Comment here']"));
        String commentText = comment.getAttribute("value");
        System.out.println(commentText);
        assertEquals("Leadership Development", commentText);

        //For the negative test :
       // assertEquals("This is a negative test", commentText);
        //System.out.println(driver.findElement(By.xpath("//textarea[@placeholder='Comment here']")).getAttribute("value"));



        //Use this for the date compare to view button because it has 'and' option on xpath.
        // System.out.println(driver.findElement(By.xpath("//input[@class='inputAlign optionalHintText' and @id='Amount']")).getAttribute("value"));


//Leadership Development

    }

    }








