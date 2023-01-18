package Ge.Infra.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Driver implements Login {
    public WebDriver driver;

    public abstract void initializeDriver();
    public void login() throws InterruptedException {


        driver.manage().window().fullscreen();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");

        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
        driver.manage().window().fullscreen();

    }

    public void closeDriver() {
        driver.close();


    }
}



