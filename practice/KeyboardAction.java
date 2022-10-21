package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act = new Actions (driver);
		
		act. sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		act. sendKeys(Keys.ALT).perform();
		Thread.sleep(3000);
		
		act. sendKeys(Keys.ARROW_LEFT).perform();
		Thread.sleep(3000);
		
		act. sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		
		
		
		
		

	}

}
