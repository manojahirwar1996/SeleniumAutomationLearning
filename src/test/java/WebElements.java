import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/login.html");
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("test@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("123456");

        System.out.println("Text Field Set");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        driver.quit();
    }
}
