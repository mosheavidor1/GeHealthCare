package Test;

import Ge.Infra.UI.ChromeDriver;
import Ge.Infra.UI.Driver;
import Ge.Infra.UI.properties.Credentials;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUI {


    private Driver driver;
    private Credentials credentials;

  @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.initializeDriver();




    }
    @Test

    public void Login() throws InterruptedException {

      driver=new ChromeDriver();

      driver.login();
        credentials = new Credentials();
        credentials.setUsername(credentials.getUsername());
        credentials.setPassword(credentials.getPassword());

    }

}

