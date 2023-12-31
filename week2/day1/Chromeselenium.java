package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeselenium {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","D:\\TestAutomation\\120 version chrome driver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		}
}
