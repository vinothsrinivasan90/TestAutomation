package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.myntra.com/");
	String parent = driver.getWindowHandle();
	System.out.println("Parent window address :"    +parent);
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("bags"+Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='product-productMetaInfo']")).click();
	Set<String> ChildWindow=driver.getWindowHandles();
	List<String> totalwindow= new ArrayList<String> (ChildWindow);
	driver.switchTo().window(totalwindow.get(1));
	System.out.println(totalwindow.get(0));
	driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	driver.close();
	
	
	
	}

}
