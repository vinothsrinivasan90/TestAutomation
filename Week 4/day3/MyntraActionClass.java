package week4.day3;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraActionClass {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement copy = driver.findElement(By.xpath("//strong[text()='SHOP ONLINE AT MYNTRA WITH COMPLETE CONVENIENCE']"));
		Actions action = new Actions(driver);
		action.scrollToElement(copy).perform();
		File Scr = copy.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/element2capture.png");
		FileUtils.copyFile(Scr, target);
		
	}

}
