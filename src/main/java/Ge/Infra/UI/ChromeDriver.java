package Ge.Infra.UI;


import org.openqa.selenium.WebDriver;

public class ChromeDriver extends Driver {
        public void initializeDriver() {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");


                    driver=new org.openqa.selenium.chrome.ChromeDriver();
        }
    }


