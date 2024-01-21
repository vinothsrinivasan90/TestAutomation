package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		WebElement crm = driver.findElement(By.xpath("//div[@for='crmsfa']"));
	    crm.click();
	    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	    WebElement fr =driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]"));
	    fr.click();
	    Set<String> ChildWindow=driver.getWindowHandles();
		List <String> totalwindow= new ArrayList<String>(ChildWindow);
		driver.switchTo().window(totalwindow.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-body']//table//a)[1]")).click();
		driver.switchTo().window(totalwindow.get(0));
		WebElement to =driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));
		to.click();
		Set<String> ChildWindow2=driver.getWindowHandles();
		List <String> totalwindow2= new ArrayList<String>(ChildWindow2);
		driver.switchTo().window(totalwindow2.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-row    x-grid3-row-alt']//a)[1]")).click();
		driver.switchTo().window(totalwindow.get(0));
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);
		
	    

	}

}
