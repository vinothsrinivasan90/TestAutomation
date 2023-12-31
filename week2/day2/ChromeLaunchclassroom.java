package week2.day2;


import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchclassroom {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.close();
	}
	
}
