package week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbhibusBooking {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='container auto-complete-drop-down ']//li)[1]")));
        suggestion.click();
        driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
        Thread.sleep(5000);
        WebElement To = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='container auto-complete-drop-down ']//li)[1]")));
        To.click();
        driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='row filter-wrapper']//span[text()='Sleeper']")).click();
        String busname= driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
        System.out.println("Bus name     :" +busname);
		String seatsavailable = driver.findElement(By.xpath("(//div[@class='text-grey']/small)[1]")).getText();
		System.out.println("Seats Available :   "+seatsavailable);
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();//showseat
		
		//select seat
		driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
		//seat number
		Thread.sleep(2000);
		String seatnumber= driver.findElement(By.xpath("(//span[@class='text-primary'])[1]")).getText();
		System.out.println("Seat Number : "+seatnumber);
		String fare= driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println("fare : "+fare);
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
	}

}
