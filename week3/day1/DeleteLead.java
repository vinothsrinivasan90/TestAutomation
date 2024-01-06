package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

	public static void main(String[] args) {
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
	    driver.findElement(By.xpath("//ul[@class='sectionTabBar']//a[text()='Leads']")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//div[@class='x-tab-panel']//span[text()='Phone']")).click();
	    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("888");
	    driver.findElement(By.xpath("//div[@class='x-panel-footer x-panel-footer-noborder']//button")).click();
	    String ld = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	    driver.findElement(By.xpath("//div[@class=\"allSubSectionBlocks\"]//a[text()='Delete']")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[1]")).sendKeys(ld);
	    driver.findElement(By.xpath("//div[@class='x-panel-footer x-panel-footer-noborder']//button[text()='Find Leads']")).click();
	     String disp=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	     if(disp=="No records to display") {
	    	 
	    	 System.out.println("successful deletion");
	    	 
	     }
	     else {
	    	 
	    	 System.out.println("not deleted");
	     }
	}

}
