package autoamericanas;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TesteRule {

    private static WebDriver driver;

    @Before
    public void beforeCenario(){
        //Firefox
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.americanas.com.br/");
    }

    @After
    public void afterCenario(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
