package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class NykaAction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.nykaa.com/");
	    Actions actions = new Actions(driver);
	    WebElement Brand = driver.findElement(By.xpath("//a[text()='brands']"));
	    actions.moveToElement(Brand).perform();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	    WebElement loreal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("L'Oreal Paris")));
	    System.out.println(loreal.getText());
        driver.executeScript("arguments[0].click();", loreal);
	    
	}

}
