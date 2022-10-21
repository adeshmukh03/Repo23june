package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWay {

	public static void main(String[] args) {
		//Step1: Set path for driver executable
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\SeleniumBasic\\executables\\chromedriver.exe");
		//Step2: Create an instance of Required Browser class
		WebDriver driver=new ChromeDriver();
	}
}