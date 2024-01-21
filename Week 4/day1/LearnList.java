package week4.day1;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirt Men" +Keys.ENTER);
	driver.findElement(By.xpath("//label[text()='HIGHLANDER']/div")).click();
	List<WebElement> brandcount = driver.findElements(By.xpath("//h3[@class='product-brand']"));
    int count = brandcount.size();
    System.out.println("Number of items in brand" +count);
    
    for (int i = 0; i < count; i++) {
		WebElement element = brandcount.get(i);
		String brandname = element.getText();
		if(brandname.equalsIgnoreCase("HIGHLANDER")) {
			
			System.out.println("Brand is verified");
		}
		
		else {
			System.out.println("Not verified");
		}
		
	}
    
	}

}
