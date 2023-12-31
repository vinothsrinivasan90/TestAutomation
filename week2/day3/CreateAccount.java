package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		crm.click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("VinothK");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select indtype = new Select(industry);
		indtype.selectByValue("IND_SOFTWARE");
		WebElement corp = driver.findElement(By.name("ownershipEnumId"));
		Select corptype = new Select(corp);
		corptype.selectByVisibleText("S-Corporation");
		WebElement src = driver.findElement(By.name("dataSourceId"));
		Select sourcetype = new Select(src);
		sourcetype.selectByValue("LEAD_EMPLOYEE");
		WebElement ecom = driver.findElement(By.id("marketingCampaignId"));
		Select marketing = new Select (ecom);
		marketing.selectByIndex(6);
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st = new Select (State);
		st.selectByValue("TX");
		WebElement create = driver.findElement(By.className("smallSubmit"));
		create.click();
		WebElement createdAccount = driver.findElement(By.xpath("//span[text()='Account Name']/following::span"));
		String accname = createdAccount.getText();
		System.out.println(accname);
	}

}
