import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
       WebElement option1 =driver.findElement(By.xpath("//input[@type='radio' and @value='Option 1']"));
        WebElement option2 =driver.findElement(By.xpath("//input[@type='radio' and @value='Option 2']"));
        WebElement option3 =driver.findElement(By.xpath("//input[@type='radio' and @value='Option 3']"));
        option1.click();
        System.out.println("option 1 is clicked" );
        System.out.println( option1.isEnabled());
        System.out.println( option1.isSelected());
        System.out.println( option1.isDisplayed());

        Thread.sleep(2000);
        option2.click();
        System.out.println("option 2 is clicked" );
        Thread.sleep(2000);
        option3.click();
        System.out.println("option 3 is clicked" );


Thread.sleep(2000);
        WebElement checkbox1 =driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox1']"));
        WebElement checkbox2 =driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox2']"));
        WebElement checkbox3 =driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox3']"));
        checkbox1.click();
        System.out.println("checkbox 1 is clicked" );
        System.out.println( checkbox1.isEnabled());
        System.out.println( checkbox1.isSelected());
        System.out.println( checkbox1.isDisplayed());


        Thread.sleep(2000);
        checkbox2.click();
        System.out.println("checkbox 2 is clicked" );
        Thread.sleep(2000);
        checkbox3.click();
        System.out.println("option 3 is clicked" );
        Thread.sleep(2000);
        if(checkbox1.isSelected())
            checkbox1.click();
        if(checkbox2.isSelected())
            checkbox2.click();
        driver.quit();
    }
}
