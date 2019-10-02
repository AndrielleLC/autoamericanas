package autoamericanas;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TesteRule {

    private static WebDriver driver;

    @Before
    public void beforeCenario(){
        //Chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        //System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver/geckodriver.exe");
        //driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.americanas.com.br/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void afterCenario(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
