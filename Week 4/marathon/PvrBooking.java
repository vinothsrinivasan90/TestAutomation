package week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PvrBooking {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search your city']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement searchcity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search-cities")));
		searchcity.sendKeys("Chennai");
		WebElement citylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='city-thumbnail']//a")));
		citylist.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']//i")).click();
		WebElement library =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='sidebar-list']//li/a[text()='Movie Library']")));
		library.click();
		WebElement genretype = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("genre")));
		Select genre = new Select(genretype);
		genre.selectByVisibleText("ANIMATION");
		System.out.println("Genre selected");
		WebElement lang = driver.findElement(By.name("lang"));
		Select language= new Select(lang);
		language.selectByVisibleText("ENGLISH");
		System.out.println("Language selected");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		System.out.println("Selection applied");
	    WebElement Movie=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='movie-list']//div[contains(text(), 'English • ANIMATION • 2021')]")));
		driver.executeScript("arguments[0].click();", Movie);
		
		WebElement proceed=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-info-fixed']/button")));
		proceed.click();
		System.out.println("Please proceed to Book");
		Thread.sleep(4000);
		WebElement Cinema = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cinemaName")));
		Select cine = new Select(Cinema);
		cine.selectByValue("PVR Heritage RSL ECR Chennai");
		Thread.sleep(4000);
		WebElement date = driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']"));
		date.click();
		driver.findElement(By.xpath("//div[@class='main-calendar-days']/span[text()='19']")).click();
		WebElement time = driver.findElement(By.xpath("//select[@name='timings']"));
		Select timings = new Select(time);
		timings.selectByValue("09:00 AM - 12:00 PM");
		WebElement seats= driver.findElement(By.xpath("//input[@name='noOfTickets']"));
		seats.sendKeys("2");
		WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Vinoth");
		WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("VinothTest@gmail.com");
		WebElement mobile= driver.findElement(By.xpath("//input[@name='mobile']"));
		mobile.sendKeys("8888888888");
		WebElement food= driver.findElement(By.xpath("//select[@name='food']"));
		Select fandb =new Select(food);
		fandb.selectByVisibleText("No");
		WebElement comments= driver.findElement(By.xpath("//input[@name='comment']"));
		comments.sendKeys("Not applicable");
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy To Self']"));
		copy.click();
		WebElement sendRequest= driver.findElement(By.xpath("//button[@class='btn btn-primary rightFloat']"));
		sendRequest.click();
		driver.findElement(By.xpath("(//div[@class='ui text-center']//button[text()='CANCEL'])[2]")).click();
        System.out.println("OTP request cancelled");
        String title = driver.getTitle();
        System.out.println("The Title of page :            " +title);
			}

}
