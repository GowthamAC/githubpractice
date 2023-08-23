import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chrome {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
}
}
