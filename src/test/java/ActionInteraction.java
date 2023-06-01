import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionInteraction {
    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/newtours/";

        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.xpath("//a[text()='Home']"));
        WebElement hoveredElement = driver.findElement(By.xpath("//tbody/tr[contains(@class,'mouse')][1]"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
        System.out.println("Before hover " + hoveredElement.getCssValue("background-color"));
        mouseOverHome.perform();
        System.out.println("After hover " + hoveredElement.getCssValue("background-color"));

        driver.close();  // The close() method closes the currently focused window, quitting the driver if the current window is the only open window
        driver.quit();   // The quit() method quits the driver, closing every associated window
    }
}
