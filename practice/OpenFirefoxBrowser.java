package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		// Step1: using System.setProperty(key,value) set to path for GeckoDriver.exe
				System.setProperty("webdriver.gecko.driver",
						"F:\\Workspace\\SeleniumBasic\\executables\\geckodriver.exe");
				// Step2: Create an instance of FirefoxDriver class
				FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.instgram"
				+ ".com");
		fdriver.close();

	}

}
