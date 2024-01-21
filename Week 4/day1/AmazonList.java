package week4.day1;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("phones" +Keys.ENTER);
		
		List<WebElement> priceall = driver.findElements(By.xpath("//div[@class='a-section']//span[@class='a-price-whole']"));
		List <Integer> allmobprice = new LinkedList<Integer>();
		int totalmobile = priceall.size();
		System.out.println("Total mobiles :" +totalmobile);
		for (int i = 0; i < totalmobile; i++) {
	    String pricedetail = priceall.get(i).getText();
	    int pricefinal = Integer.parseInt(pricedetail.replaceAll("[^0-9]",""));
	    allmobprice.add(pricefinal);
			
		}
		Collections.sort(allmobprice);
		System.out.println("Sorted mobile price is :\n" +allmobprice);
	}

}
