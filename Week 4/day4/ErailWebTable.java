package week4.day4;


import java.time.Duration;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
       WebElement From = driver.findElement(By.id("txtStationFrom"));
       From.clear();
       From.sendKeys("MAS",Keys.ENTER);
       WebElement To = driver.findElement(By.id("txtStationTo"));
       To.clear();
       To.sendKeys("MDU",Keys.ENTER);
        driver.findElement(By.id("chkSelectDateOnly")).click();
        List <WebElement> trainlist = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
        int totaltrainlist = trainlist.size();
        Set <String> addTrain = new LinkedHashSet<String>();
        for (int i = 2; i <=totaltrainlist; i++) {
        	String trainnames = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(trainnames);
			addTrain.add(trainnames);
		}
        
        
        if (totaltrainlist==addTrain.size()) {
        	System.out.println("No duplicate trains ");
        	
        }
        else {
        	
        	System.out.println("Duplicate train found");
        }
        
	}

}
