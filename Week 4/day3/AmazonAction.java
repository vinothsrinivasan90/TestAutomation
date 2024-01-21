package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAction {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("oneplus 9 pro"+Keys.ENTER);
		String price = driver.findElement(By.xpath("(//div[@class='puisg-col-inner']//span[@class='a-price-whole'])[1]")).getText();
	    System.out.println(price);
	    String rating = driver.findElement(By.xpath("(//div[@class='puisg-col-inner'])[2]//span[@class='a-size-base s-underline-text']")).getText();
	    System.out.println("Customer rating :"+rating);
	    WebElement prod =driver.findElement(By.xpath("(((//div[@class='puisg-col-inner'])[2])//h2)"));
	    prod.click();
	    Set<String> window1 = driver.getWindowHandles();
	    List<String> newWindow = new ArrayList<String>(window1);
	    driver.switchTo().window(newWindow.get(1));
	    Thread.sleep(5000);
	    WebElement proddetails = driver.findElement(By.id("ppd"));
	    File Scr = proddetails.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/produtdetails.png");
		FileUtils.copyFile(Scr, target);
		driver.findElement(By.id("add-to-cart-button")).click();
	    String subtotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	    System.out.println("The Subtotal of product is  "+subtotal);
	    
	    if(price.equals(subtotal)) {
	    	
	    	System.out.println("Price is correct");
	    	
	    }
	    else {
	    	
	    	System.out.println("Price not correct");
	    }
	    driver.close();
	}
	}

