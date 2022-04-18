import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver ","C:\\Users\\Anika T\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
         driver.get("http://automationpractice.com/index.php");
	}

}
