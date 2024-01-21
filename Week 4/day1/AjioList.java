package week4.day1;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags" +Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='facets']//label[@for='Men']")).click();
		WebElement fashion = driver.findElement(By.xpath("//div[@class='facets']//label[@for='Men - Fashion Bags']"));
		driver.executeScript("arguments[0].click();", fashion);
		String itemcount = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		String count =itemcount.replaceAll("[^0-9]","");
		System.out.println("Total number og bags :"+count);
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='contentHolder']/div/strong"));
		
	      
		for (WebElement brandElement : brands) {
		    String brandName = brandElement.getText();
		    System.out.print("=================== Brand Names of bags ============== ");
		    System.out.println(brandName);

	}

		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		for(WebElement name : bagName){
			
			String nameBag = name.getText();
			
			System.out.println(nameBag);
			
		}
		
}
}