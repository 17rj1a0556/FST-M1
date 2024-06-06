import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
