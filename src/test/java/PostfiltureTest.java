// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class PostfiltureTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void successfulAddBlogPost() {
        // Test name: SuccessfulAddBlogPost
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("http://127.0.0.1:7000/");
        // 2 | setWindowSize | 550x584 |
        driver.manage().window().setSize(new Dimension(550, 584));
        // 3 | click | linkText=New post |
        driver.findElement(By.linkText("New post")).click();
        // 4 | click | css=.post-form__title |
        driver.findElement(By.cssSelector(".post-form__title")).click();
        // 5 | click | css=.post-form__title |
        driver.findElement(By.cssSelector(".post-form__title")).click();
        // 6 | editContent | css=.post-form__title | some title
        {
            WebElement element = driver.findElement(By.cssSelector(".post-form__title"));
            js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'some title'}", element);
        }
        // 7 | click | css=.post-form__description |
        driver.findElement(By.cssSelector(".post-form__description")).click();
        // 8 | editContent | css=.post-form__description | some body
        {
            WebElement element = driver.findElement(By.cssSelector(".post-form__description"));
            js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'some body'}", element);
        }
        // 9 | click | css=.post-form__button:nth-child(2) |
        driver.findElement(By.cssSelector(".post-form__button:nth-child(2)")).click();
        // 10 | click | css=.alert__button |
        driver.findElement(By.cssSelector(".alert__button")).click();
    }
}
