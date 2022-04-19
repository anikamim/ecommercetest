package test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGooglePage {

	@Test
	public void pageLoadTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("email_create")).sendKeys("anika123@gmail.com");
	    driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
        driver.findElement(By.cssSelector("#id_gender2")).click();
      try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
