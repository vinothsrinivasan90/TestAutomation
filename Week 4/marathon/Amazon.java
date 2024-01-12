package week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Amazon {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("bags for boys"+Keys.ENTER);
		String results = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
		System.out.println("Result values :"+results);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		WebElement sort = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		driver.executeScript("arguments[0].click();", sort);
		driver.findElement(By.xpath("//div[@class='a-popover-inner']//a[text()='Newest Arrivals']")).click();
		String details = driver.findElement(By.xpath("((//span[@class='a-declarative']//div)[6])[1]")).getText();
		
		System.out.println("Product details of first result  :"+details);
		String page = driver.getTitle();
		System.out.println("Title of Page :"+page);
	}

}
