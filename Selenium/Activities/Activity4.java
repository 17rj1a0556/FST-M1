import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4 {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
        String Test = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println(Test);
        String Test1 = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println(Test1);
        String color = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(color);
        String color1 = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println(color1);
        driver.quit();
    }



}
