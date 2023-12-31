package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("http://leaftaps.com/opentaps/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		

	}

}
