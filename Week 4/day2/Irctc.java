package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in//");
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set <String> parent = driver.getWindowHandles();
		List<String> nextwindow= new ArrayList<String>(parent);
		driver.switchTo().window(nextwindow.get(1));
		String flighttitle= driver.getTitle();
		System.out.println("Title of child Window" +flighttitle);
		driver.switchTo().window(nextwindow.get(0));
	    
	   
	    driver.close();
		

	}

}
