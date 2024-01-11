package week4.day4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGroundExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/waits.xhtml");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement click = driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
		click.click();
		WebElement change= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Did you notice?']")));
		System.out.println(change.isDisplayed());
		System.out.println("Changed Text is : "+change.getText());
		
		
	}

}
