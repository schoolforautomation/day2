import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void firstSeleniumTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://school-for-automation.tech");
        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("submit"));

        usernameInput.sendKeys("tester");
        passwordInput.sendKeys("test1234");
        loginButton.click();

        // WebElement getStartedButton = driver.findElement(By.id("get-started"));
        WebElement getStartedButton = driver.findElement(By.xpath("//*[@id=\"cta\"]/div[2]/div/div/a"));
        getStartedButton.click();
        Thread.sleep(5000);

        driver.close();
    }
}
