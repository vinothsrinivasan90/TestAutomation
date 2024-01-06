package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		WebElement crm = driver.findElement(By.xpath("//div[@for='crmsfa']"));
	    crm.click();
	    driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("VKslead55");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vinoth535");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kuma55r");
		WebElement source = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select src = new Select(source);
		src.selectByIndex(3);
		WebElement mrkt = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select marketing = new Select(mrkt);
		marketing.selectByVisibleText("Automobile");
		WebElement own = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own2 = new Select(own);
		own2.selectByValue("OWN_SCORP");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			
			System.out.println("Lead verified");
			
		}
		else {
			System.out.println("not verified");
		}
		

	}

}
