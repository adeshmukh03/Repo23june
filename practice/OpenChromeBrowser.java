package practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		//Step1: using System.setProperty(key,value) set to path for ChromeDriver.exe
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\SeleniumBasic\\executables\\chromedriver.exe");
		//Step2: Create an instance of ChromeDriver class
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
	}
}

