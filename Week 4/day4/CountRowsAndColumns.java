package week4.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRowsAndColumns {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
        List <WebElement> row= driver.findElements(By.xpath("//div[@class='render']//table/tbody/tr"));
        int totalrows = row.size();
        System.out.println("Total number of columns in Table  :      "+totalrows);
        List <WebElement> col= driver.findElements(By.xpath("//div[@class='render']//table/thead//th"));
        int totalcolumns = col.size();
        System.out.println("Total number of columns in Table  :      "+totalcolumns);
        
	}

}
