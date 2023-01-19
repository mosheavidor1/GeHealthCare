
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

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


        WebElement date = driver.findElement(By.xpath("//div[contains(text(),'2022-08-15 - 2022-08-21')]"));
        List<WebElement> views = date.findElements(By.tagName("View"));
        for (WebElement view : views) {
            if (view.getText().equals("View")) {
                view.click();
                break;

            }
        }

//
//        WebElement viewInDate = driver.findElement(By.xpath("//div[contains(text(),'2022-08-15 - 2022-08-21')]"));
//        WebElement view=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='View'])[2]"));
//
//        if(viewInDate.isDisplayed()) {
//            view.click();
//        }



            }
        }





