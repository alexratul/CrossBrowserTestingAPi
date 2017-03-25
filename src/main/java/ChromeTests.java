import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTests {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/alejandro/Documents/Java projects/WebDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
